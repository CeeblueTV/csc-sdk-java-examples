package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.Access;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.CreatedInput;

public class InputStreamUpdatingExample {

    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();
        String streamId = "Place your streamId here";

        try {
            CreatedInput createdInput = inputStreamClient.updateInput(streamId, Access.Private, "token");

            System.out.println(createdInput);
        } catch (ClientException exception) {
            System.out.println("Something went wrong: " + exception);
        }

    }
}

