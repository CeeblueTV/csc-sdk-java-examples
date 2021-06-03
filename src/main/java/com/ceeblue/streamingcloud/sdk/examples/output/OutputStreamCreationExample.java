package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.InputFormat;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.CreatedOutput;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.Output;

import java.util.List;

public class OutputStreamCreationExample {

    public static void main(String[] args) {
        String streamId = "Place your streamId here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        try {
            CreatedOutput createdOutput = outputStreamClient.createOutput(new Output(streamId, InputFormat.RTMP));

            System.out.println(createdOutput);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
