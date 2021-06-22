package com.ceeblue.streamingcloud.sdk.examples.snapshot;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.models.Source;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.models.ContentType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;

public class StreamSnapshotImageFetchingExample {

    private static final String SNAPSHOT = "snapshot.";

    private static final String CONTENT_TYPE = "Content-Type";

    public static void main(String[] args) {
        SnapshotClient snapshotClient = ApiClientCreateExamples
                .getSnapshotClient(new Credentials("Place your username here", "Place your password here"));

        String streamId = "Place your input streamId here";

        try {
            var responseInfo = snapshotClient.getSnapshotImage(streamId, Source.Outgoing);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(responseInfo.getBody());
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            String imageFormat = Arrays.stream(ContentType.values())
                    .filter(e -> e.contentType.equals(responseInfo.getHeaders().get(CONTENT_TYPE)))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Unknown type: " + responseInfo.getHeaders().get(CONTENT_TYPE))).format;

            File snapshot = new File(LocalDateTime.now() + SNAPSHOT + imageFormat);
            ImageIO.write(bufferedImage, imageFormat, snapshot);

            System.out.println("Snapshot location" + snapshot.getAbsolutePath());
        } catch (RuntimeException | IOException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
