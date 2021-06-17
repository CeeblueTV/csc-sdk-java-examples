package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;

public class StreamSnapshotImageFetchingExample {

    public static void main(String[] args) {
        SnapshotClient snapshotClient = ApiClientCreateExamples
                .getSnapshotClient(new Credentials("Place your username here", "Place your password here"));

        String streamId = "Place your input streamId here";

        try {
            var image = snapshotClient.getSnapshotImage(streamId, Source.Incoming);

            System.out.println("Snapshot location"+image.getAbsolutePath());
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
