package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.Snapshot;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.SnapshotFormatType;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.SnapshotQualityType;

import static com.ceeblue.streamingcloud.sdk.streams.snapshot.models.SnapshotFormatType.JPEG;

public class UpdateSnapshotExample {

    public static void main(String[] args) {
        Snapshot snapshot = new Snapshot().setFormat(SnapshotFormatType.PNG).setInterval(5).setQuality(SnapshotQualityType.High);
        snapshot.setFormat(JPEG);

        SnapshotClient snapshotClient = ApiClientsCreationExamples.getSnapshotClient();
        String streamId = "Place your input streamId here";

        try {
            snapshotClient.updateSnapshotSettings(snapshot, streamId, Source.Incoming);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
