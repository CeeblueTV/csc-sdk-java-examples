package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.push.models.output.TrackSelector;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Capture;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.FileFormat;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Recording;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.created.RecordingStatus;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3;

import static com.ceeblue.streamingcloud.sdk.streams.input.models.tracks.TrackType.Video;

public class StreamRecordingCreationExample {

    public static void main(String[] args) {
        StorageClient storageClient = ApiClientCreateExamples
                .getStorageClient(new Credentials("Place your username here", "Place your password here"));

        String storageId = "Place your storage id here";
        AmazonS3 storage = storageClient.getStorage(storageId);

        RecordingClient recordingClient = ApiClientCreateExamples
                .getRecordingClient(new Credentials("Place your username here", "Place your password here"));

        String streamId = "Place your input streamId here";

        Recording recording = new Recording(streamId, "recordingTest", FileFormat.MKV,
                new Capture().setSource(Source.Incoming).setTrackSelector(new TrackSelector(Video)), storage.getName()
        );

        try {
            RecordingStatus recordingStatus = recordingClient.createRecording(recording);

            System.out.println(recordingStatus);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
