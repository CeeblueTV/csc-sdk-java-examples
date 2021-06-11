package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.OutputEndpoint;

import java.util.List;

public class FetchingOutputStreamExample {

    public static void main(String[] args) {
        String streamId = "Place your input stream id here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        try {
            List <OutputEndpoint> outputs = outputStreamClient.getOutputs(streamId);

            System.out.println("Results: ");
            outputs.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
