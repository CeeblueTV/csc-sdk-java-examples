package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;

public class GetSnapshotImageExample {
    public static void main(String[] args) {
        SnapshotClient snapshotClient = ApiClientsCreationExamples.getSnapshotClient();

        String streamId = "Place your streamId here";

        snapshotClient.getSnapshotImage(streamId, Source.Incoming);
    }
}
