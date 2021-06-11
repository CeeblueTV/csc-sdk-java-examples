package com.ceeblue.streamingcloud.sdk.examples.push;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;

public class FetchingPushExample {

    public static void main(String[] args) {
        var pushClient = ApiClientsCreationExamples.getPushClient();
        String streamId = "Place your push id here";

        try {
            var push = pushClient.getStreamPush(streamId);

            System.out.println(push);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}

class FetchingAllPushes {

    public static void main(String[] args) {
        var pushClient = ApiClientsCreationExamples.getPushClient();
        String streamId = "Place your stream id here";

        try {
            var pushes = pushClient.retrieveStreamPush(streamId);

            System.out.println("Result:");

            pushes.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
