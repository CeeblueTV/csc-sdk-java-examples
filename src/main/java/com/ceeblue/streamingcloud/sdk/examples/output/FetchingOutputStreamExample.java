package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.OutputEndpoint;

import java.util.List;

public class FetchingOutputStreamExample {

    public static void main(String[] args) {
        String streamId = "abfa40ec-5b8d-45af-92e6-fee5659db346";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        try {
            List <OutputEndpoint> outputs = outputStreamClient.getOutputs(streamId);

            System.out.println(outputs);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
