package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;

public class InputStreamDeletingExamole {
    public static void main(String[] args) {
        String streamId = "Place your streamId here";

        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        inputStreamClient.deleteInput(streamId);

    }
}
