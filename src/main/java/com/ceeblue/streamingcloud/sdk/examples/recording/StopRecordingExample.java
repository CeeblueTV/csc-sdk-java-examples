package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;

public class StopRecordingExample {
    public static void main(String[] args) {
        String recordingId = "Place your recording id here";

        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();

        recordingClient.stopRecording(recordingId);
    }
}
