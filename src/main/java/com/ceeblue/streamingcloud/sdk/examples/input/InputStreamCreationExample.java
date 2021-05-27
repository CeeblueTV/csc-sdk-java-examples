package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.StreamBuilder;
import com.ceeblue.streamingcloud.sdk.streams.input.models.InputFormat;
import com.ceeblue.streamingcloud.sdk.streams.input.models.OutputSettings;
import com.ceeblue.streamingcloud.sdk.streams.input.models.SpeedPreset;
import com.ceeblue.streamingcloud.sdk.streams.input.models.encoder.EncoderSettings;
import com.ceeblue.streamingcloud.sdk.streams.input.models.encoder.H264Settings;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.CreatedInput;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.Input;
import com.ceeblue.streamingcloud.sdk.streams.input.models.tracks.AudioTrack;
import com.ceeblue.streamingcloud.sdk.streams.input.models.tracks.TrackType;
import com.ceeblue.streamingcloud.sdk.streams.input.models.tracks.VideoTrack;

import java.util.Arrays;

import static com.ceeblue.streamingcloud.sdk.streams.input.models.CodecName.AAC;
import static com.ceeblue.streamingcloud.sdk.streams.input.models.CodecName.H264;

public class InputStreamCreationExample {

    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        StreamBuilder builder = new StreamBuilder(InputFormat.WebRTC)
                .setOutput(
                        new OutputSettings(true)
                                .version(1)
                                .tracks(Arrays.asList(
                                        new VideoTrack(TrackType.Video, new H264Settings(H264, 110, SpeedPreset.faster, 20)),
                                        new AudioTrack(TrackType.Audio, new EncoderSettings(AAC, 30))
                                )));

        Input input = builder.build();

        CreatedInput createdInput = inputStreamClient.createInput(input);

        System.out.println(createdInput);
    }
}
