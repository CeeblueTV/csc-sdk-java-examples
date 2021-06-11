package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;

public class DeleteRecordingExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();

        String recordingId = "Place your recording id here";

        try {
            recordingClient.deleteRecording(recordingId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
