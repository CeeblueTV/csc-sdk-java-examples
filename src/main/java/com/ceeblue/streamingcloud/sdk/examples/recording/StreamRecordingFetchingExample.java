package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.created.RecordingStatus;

import java.util.List;

public class StreamRecordingFetchingExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientCreateExamples
                .getRecordingClient(new Credentials("Place your username here", "Place your password here"));

        String recordingId = "Place your recording id here";

        RecordingStatus recording = recordingClient.getRecording(recordingId);

        System.out.println(recording);
    }
}

class StreamRecordingFetchAllExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientCreateExamples
                .getRecordingClient(new Credentials("Place your username here", "Place your password here"));

        try {
            List<RecordingStatus> recordings = recordingClient.getRecordings();

            System.out.println("Results: ");
            recordings.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}

class StreamRecordingFetchAllByStreamExample {

    public static void main(String[] args) {
        RecordingClient recordingClient = ApiClientCreateExamples
                .getRecordingClient(new Credentials("Place your username here", "Place your password here"));

        String streamId = "Place your input streamId here";

        try {
            List<RecordingStatus> recordings = recordingClient.getRecordingByStreamId(streamId);

            System.out.println("Results: ");
            recordings.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
