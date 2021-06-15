package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;

public class StreamInputDeletingExample {

    public static void main(String[] args) {
        String streamId = "Place your input id here";

        InputStreamClient inputStreamClient = ApiClientCreateExamples
                .getInputStreamClient(new Credentials("Place your username here", "Place your password here"));

        try {
            inputStreamClient.deleteInput(streamId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
