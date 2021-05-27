package com.ceeblue.streamingcloud.sdk.examples.recording;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.push.models.TrackSelector;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Capture;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.FileFormat;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Recording;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.created.CreatedRecording;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3;

import static com.ceeblue.streamingcloud.sdk.streams.input.models.tracks.TrackType.Video;

public class RecordingCreationExample {
    public static void main(String[] args) {
        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        String storageId = "Place your storage id here";
        AmazonS3 storage = storageClient.getStorage(storageId);

        RecordingClient recordingClient = ApiClientsCreationExamples.getRecordingClient();

        String streamId = "Place your streamId here";

        CreatedRecording createdRecording = recordingClient.createRecording(
                new Recording(streamId, "recordingTest", FileFormat.MKV,
                        new Capture().setSource(Source.Incoming).setTrackSelector(new TrackSelector(Video)), storage.getName()
                )
        );

        System.out.println(createdRecording);
    }
}
