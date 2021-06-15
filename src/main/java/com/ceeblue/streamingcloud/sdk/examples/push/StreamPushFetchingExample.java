package com.ceeblue.streamingcloud.sdk.examples.push;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;

public class StreamPushFetchingExample {

    public static void main(String[] args) {
        var pushClient = ApiClientCreateExamples
                .getPushClient(new Credentials("Place your username here", "Place your password here"));
        String streamId = "Place your push id here";

        try {
            var push = pushClient.getStreamPush(streamId);

            System.out.println(push);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}

class StreamPushFetchingAll {

    public static void main(String[] args) {
        var pushClient = ApiClientCreateExamples
                .getPushClient(new Credentials("Place your username here", "Place your password here"));
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
