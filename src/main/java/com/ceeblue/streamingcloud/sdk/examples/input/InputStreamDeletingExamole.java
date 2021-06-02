package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;

public class InputStreamDeletingExamole {
    public static void main(String[] args) {
        String streamId = "0b8d2ce2-06ca-446d-99e9-e067fdfdf8b3";

        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        inputStreamClient.deleteInput(streamId);

    }
}
