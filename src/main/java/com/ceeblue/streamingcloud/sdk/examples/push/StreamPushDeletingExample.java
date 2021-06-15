package com.ceeblue.streamingcloud.sdk.examples.push;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;

public class StreamPushDeletingExample {

    public static void main(String[] args) {
        String pushId = "Place your push id here";

        try {
            var pushClient = ApiClientCreateExamples
                    .getPushClient(new Credentials("Place your username here", "Place your password here"));

            pushClient.deleteStreamPush(pushId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
