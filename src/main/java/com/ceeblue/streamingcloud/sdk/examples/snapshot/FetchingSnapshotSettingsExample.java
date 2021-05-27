package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.Recording;

public class FetchingSnapshotSettingsExample {
    public static void main(String[] args) {
        SnapshotClient snapshotClient = ApiClientsCreationExamples.getSnapshotClient();

        String streamId = "Place your streamId here";

        Recording recording = snapshotClient.getSnapshotSettings(streamId, Source.Incoming);

        System.out.println(recording);
    }
}
