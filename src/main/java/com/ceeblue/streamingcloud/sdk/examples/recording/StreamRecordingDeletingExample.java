package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;

public class StreamRecordingDeletingExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientCreateExamples
                .getRecordingClient(new Credentials("Place your username here", "Place your password here"));

        String recordingId = "Place your recording id here";

        try {
            recordingClient.deleteRecording(recordingId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
