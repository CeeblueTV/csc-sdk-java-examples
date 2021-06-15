package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.models.InputFormat;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.Output;
import com.ceeblue.streamingcloud.sdk.streams.output.models.output.OutputEndpoint;

public class StreamOutputCreationExample {

    public static void main(String[] args) {
        String streamId = "Place your input stream id here";

        OutputStreamClient outputStreamClient = ApiClientCreateExamples
                .getOutputStreamClient(new Credentials("Place your username here", "Place your password here"));

        try {
            final Output output = new Output(streamId, InputFormat.RTMP);
            OutputEndpoint outputEndpoint = outputStreamClient.createOutput(output);

            System.out.println(outputEndpoint);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
