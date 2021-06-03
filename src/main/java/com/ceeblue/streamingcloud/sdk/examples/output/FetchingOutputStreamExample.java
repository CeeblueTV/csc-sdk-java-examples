package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.CreatedOutput;

import java.util.List;

public class FetchingOutputStreamExample {

    public static void main(String[] args) {
        String streamId = "Place your input streamId here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        try {
            List <CreatedOutput> outputs = outputStreamClient.getOutputs(streamId);

            System.out.println(outputs);
        } catch (ClientException exception) {
            System.out.println("Something went wrong: " + exception);
        }
    }

}
