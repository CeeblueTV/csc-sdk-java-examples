package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.CreatedInput;

public class InputStreamDeletingExamole {

    public static void main(String[] args) {
        String streamId = "Place your input id here";

        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();
        
        try {
            inputStreamClient.deleteInput(streamId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }

    }

}
