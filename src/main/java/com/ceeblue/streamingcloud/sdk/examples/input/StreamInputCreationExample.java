package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.InputStreamer;
import com.ceeblue.streamingcloud.sdk.streams.input.models.OutputSettings;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.Input;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.InputEndpoint;
import com.ceeblue.streamingcloud.sdk.streams.models.InputFormat;

import static com.ceeblue.streamingcloud.sdk.streams.utils.Presets.H264_1080p_30fps_4Mbps;
import static com.ceeblue.streamingcloud.sdk.streams.utils.Presets.Opus_48kHz_2Ch_120Kbps;

public class StreamInputCreationExample {

    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientCreateExamples
                .getInputStreamClient(new Credentials("Place your username here", "Place your password here"));

        Input input = new Input(InputFormat.WebRTC)
                .setOutput(new OutputSettings()
                        .addTrack(H264_1080p_30fps_4Mbps())
                        .addTrack(Opus_48kHz_2Ch_120Kbps())
                ).setStreamer(new InputStreamer().setIp("0.0.0.0"));

        try {
            InputEndpoint inputEndpoint = inputStreamClient.createInput(input);

            System.out.println(inputEndpoint);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
