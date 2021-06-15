package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;

public class StreamSnapshotDeletingExample {

    public static void main(String[] args) {
        SnapshotClient snapshotClient = ApiClientCreateExamples
                .getSnapshotClient(new Credentials("Place your username here", "Place your password here"));

        String streamId = "Place your streamId here";

        try {
            snapshotClient.deleteSnapshotSettings(streamId, Source.Incoming);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
