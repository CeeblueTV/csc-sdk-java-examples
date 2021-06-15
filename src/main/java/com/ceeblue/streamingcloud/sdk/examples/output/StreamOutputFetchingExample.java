package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.OutputEndpoint;

import java.util.List;

public class StreamOutputFetchingExample {

    public static void main(String[] args) {
        String streamId = "Place your input stream id here";

        OutputStreamClient outputStreamClient = ApiClientCreateExamples
                .getOutputStreamClient(new Credentials("Place your username here", "Place your password here"));

        try {
            List<OutputEndpoint> outputs = outputStreamClient.getOutputs(streamId);

            System.out.println("Results: ");
            outputs.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
