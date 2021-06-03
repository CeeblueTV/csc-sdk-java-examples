package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.created.RecordingModel;

import java.util.List;

public class FetchingRecordingExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();
        String recordingId = "Place your recording id here";

        RecordingModel recording = recordingClient.getRecording(recordingId);

        System.out.println(recording);
    }

}

class FetchAllRecordingsExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();

        try {
            List <RecordingModel> allRecordings = recordingClient.getRecordings();

            System.out.println(allRecordings);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}

class FetchAllRecordingsByStream {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();
        String streamId = "Place your input streamId here";

        try {
            List <RecordingModel> allRecordings = recordingClient.getRecordingByStreamId(streamId);

            System.out.println(allRecordings);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
