package com.ceeblue.streamingcloud.sdk.examples.push;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;

public class DeletingPushExample {

    public static void main(String[] args) {
        String pushId = "Place your push id here";

        try {
            var pushClient = ApiClientsCreationExamples.getPushClient();

            pushClient.deleteStreamPush(pushId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
