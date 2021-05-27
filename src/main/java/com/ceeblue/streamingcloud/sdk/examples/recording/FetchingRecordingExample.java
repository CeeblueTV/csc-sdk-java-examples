package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.created.CreatedRecording;

import java.util.List;

public class FetchingRecordingExample {
    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();
        String recordingId = "Place your recording id here";

        CreatedRecording recording = recordingClient.getRecording(recordingId);

        System.out.println(recording);
    }
}

class FetchAllRecordingsExample {
    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();

        List<CreatedRecording> allRecordings = recordingClient.getRecordings();

        System.out.println(allRecordings);
    }
}

class FetchAllRecordingsByStream {
    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();
        String streamId = "Place your streamId here";

        List<CreatedRecording> allRecordings = recordingClient.getRecordingByStreamId(streamId);

        System.out.println(allRecordings);
    }
}
