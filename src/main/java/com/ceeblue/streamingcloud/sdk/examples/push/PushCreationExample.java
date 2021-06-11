package com.ceeblue.streamingcloud.sdk.examples.push;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.push.models.output.RTMPOutput;
import com.ceeblue.streamingcloud.sdk.streams.push.models.push.Push;

import static com.ceeblue.streamingcloud.sdk.streams.push.models.PushFormat.RTMP;

public class PushCreationExample {

    public static void main(String[] args) {
        var pushClient = ApiClientsCreationExamples.getPushClient();
        String streamId = "Place your input stream id here";

        try {
            String serverURI = "Place your server to what you wont to push from";
            String key = "Place your key here";

            var createdPush = pushClient
                    .createPush(new Push()
                            .setFormat(RTMP)
                            .setOutput(new RTMPOutput()
                                    .setServer(serverURI)
                                    .setKey(key))
                            .setStreamId(streamId));

            System.out.println(createdPush);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
