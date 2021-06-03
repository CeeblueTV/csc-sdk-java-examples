package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.InputFormat;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.CreatedOutput;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.Output;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;

public class StopRecordingExample {

    public static void main(String[] args) {
        String recordingId = "Place your recording id here";

        try {
            RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();

            recordingClient.stopRecording(recordingId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
