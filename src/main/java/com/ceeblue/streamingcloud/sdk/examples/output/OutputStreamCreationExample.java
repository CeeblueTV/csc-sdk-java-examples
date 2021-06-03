package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.InputFormat;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.OutputEndpoint;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.Output;

public class OutputStreamCreationExample {

    public static void main(String[] args) {
        String streamId = "Place your input stream id here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        try {
            OutputEndpoint outputEndpoint = outputStreamClient.createOutput(new Output(streamId, InputFormat.RTMP));

            System.out.println(outputEndpoint);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
