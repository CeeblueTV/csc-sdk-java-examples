package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;

public class StreamRecordingStoppingExample {

    public static void main(String[] args) {
        String recordingId = "Place your recording id here";

        try {
            RecordingClient recordingClient = ApiClientCreateExamples
                    .getRecordingClient(new Credentials("Place your username here", "Place your password here"));

            recordingClient.stopRecording(recordingId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
