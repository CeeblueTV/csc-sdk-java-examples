package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;

public class StreamOutputDeletingExample {

    public static void main(String[] args) {
        String streamId = "Place your output streamId here";

        try {
            OutputStreamClient outputStreamClient = ApiClientCreateExamples
                    .getOutputStreamClient(new Credentials("Place your username here", "Place your password here"));

            outputStreamClient.deleteOutput(streamId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}

class StreamOutputSessionDeletingExample {

    public static void main(String[] args) {
        String streamId = "Place your input streamId here";

        OutputStreamClient outputStreamClient = ApiClientCreateExamples
                .getOutputStreamClient(new Credentials("Place your username here", "Place your password here"));

        try {
            outputStreamClient.deleteOutputSessions(streamId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
