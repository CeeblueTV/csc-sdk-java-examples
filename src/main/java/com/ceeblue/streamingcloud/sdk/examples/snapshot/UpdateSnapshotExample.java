package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.recording.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.Recording;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.SnapshotFormatType;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.SnapshotQualityType;

import static com.ceeblue.streamingcloud.sdk.streams.snapshot.models.SnapshotFormatType.JPEG;

public class UpdateSnapshotExample {

    public static void main(String[] args) {
        //Existed recording
        Recording recording = new Recording().setFormat(SnapshotFormatType.PNG).setInterval(5).setQuality(SnapshotQualityType.High);
        recording.setFormat(JPEG);

        SnapshotClient snapshotClient = ApiClientsCreationExamples.getSnapshotClient();
        String streamId = "Place your streamId here";

        snapshotClient.updateSnapshotSettings(recording, streamId, Source.Incoming);

    }
}
