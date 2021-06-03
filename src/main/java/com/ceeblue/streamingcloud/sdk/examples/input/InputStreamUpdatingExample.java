package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.Access;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.InputEndpoint;

public class InputStreamUpdatingExample {

    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();
        String streamId = "Place your streamId here";

        try {
            InputEndpoint inputEndpoint = inputStreamClient.updateInput(streamId, Access.Private, "token");

            System.out.println(inputEndpoint);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }

    }
}

