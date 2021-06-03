package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.Snapshot;

public class FetchingSnapshotSettingsExample {

    public static void main(String[] args) {
        SnapshotClient snapshotClient = ApiClientsCreationExamples.getSnapshotClient();

        String streamId = "Place your input streamId here";

        try {

            Snapshot snapshot = snapshotClient.getSnapshotSettings(streamId, Source.Incoming);

            System.out.println(snapshot);
        } catch (ClientException exception) {
            System.out.println("Something went wrong: " + exception);
        }
    }

}
