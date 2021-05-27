package org.example.javasdkexamples.inputStream;

import com.ceeblue.sdk.authentiffication.AuthenticationClient;
import com.ceeblue.sdk.authentiffication.AuthenticationClientImplementation;
import com.ceeblue.sdk.http.HttpClient;
import com.ceeblue.sdk.http.template.HttpRestTemplate;
import com.ceeblue.sdk.http.template.utils.RestTemplateResponseErrorHandler;
import com.ceeblue.sdk.settings.Credential;
import com.ceeblue.sdk.streams.input.InputApiClientImplementation;
import com.ceeblue.sdk.streams.input.InputStreamClient;
import com.ceeblue.sdk.streams.input.StreamBuilder;
import com.ceeblue.sdk.streams.input.models.Access;
import com.ceeblue.sdk.streams.input.models.InputFormat;
import com.ceeblue.sdk.streams.input.models.OutputSettings;
import com.ceeblue.sdk.streams.input.models.SpeedPreset;
import com.ceeblue.sdk.streams.input.models.encoder.EncoderSettings;
import com.ceeblue.sdk.streams.input.models.encoder.H264Settings;
import com.ceeblue.sdk.streams.input.models.inputs.CreatedInput;
import com.ceeblue.sdk.streams.input.models.inputs.Input;
import com.ceeblue.sdk.streams.input.models.tracks.AudioTrack;
import com.ceeblue.sdk.streams.input.models.tracks.VideoTrack;
import com.ceeblue.sdk.utils.ClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static com.ceeblue.sdk.streams.input.models.CodecName.AAC;
import static com.ceeblue.sdk.streams.input.models.CodecName.H264;
import static com.ceeblue.sdk.streams.input.models.tracks.TrackType.Audio;
import static com.ceeblue.sdk.streams.input.models.tracks.TrackType.Video;

public class InputStreamExample {

    public static void main(String[] args) {

        Credential credentials = new Credential();
        credentials.setUsername("vladyslav");
        credentials.setPassword("sudosugo");

        RestTemplate template = new RestTemplate();
        template.setErrorHandler(new RestTemplateResponseErrorHandler());

        HttpClient httpClient = new HttpRestTemplate(template);

        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        InputStreamClient inputStreamClient = new InputApiClientImplementation(authenticationClient, httpClient);
        StreamBuilder builder = new StreamBuilder(InputFormat.WebRTC)
                .setOutput(
                        new OutputSettings(true)
                                .version(1)
                                .tracks(Arrays.asList(
                                        new VideoTrack(Video, new H264Settings(H264, 110, SpeedPreset.faster, 20)),
                                        new AudioTrack(Audio, new EncoderSettings(AAC, 30))
                                )));

        Input input = builder.build();

        CreatedInput createdInput = inputStreamClient.createInput(input);


        CreatedInput finalCreatedInput1 = createdInput;
        inputStreamClient.getInput(finalCreatedInput1.getId());


        createdInput = inputStreamClient.updateInput(finalCreatedInput1.getId(), Access.Private, null);

        System.out.println(inputStreamClient.getInput(createdInput.getId()));

        CreatedInput finalCreatedInput = createdInput;

        OutputSettings output = inputStreamClient.getOutputSettings(finalCreatedInput.getId());

        output.setPassthrough(false);
        inputStreamClient.updateOutputSettings(createdInput.getId(), output);


        inputStreamClient.deleteInput(finalCreatedInput.getId());

        System.out.println("Try to fetch unexisting stream. Expect error");

        try {
            inputStreamClient.getInput(finalCreatedInput.getId());
        } catch (ClientException exception) {
            System.out.println(exception);
        }

    }
}
