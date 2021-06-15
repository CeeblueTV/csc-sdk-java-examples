package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.InputEndpoint;

import java.util.List;

public class StreamInputFetchingExample {

    public static void main(String[] args) {
        String streamId = "Place your stream id here e9ecff84-....-....-....-24872eb0e3c9";

        InputStreamClient inputStreamClient = ApiClientCreateExamples
                .getInputStreamClient(new Credentials("Place your username here", "Place your password here"));

        try {
            InputEndpoint fetchedStream = inputStreamClient.getInput(streamId);
            System.out.println(fetchedStream);
        } catch (ClientException exception) {
            System.err.println("Hmm: " + exception);
        }
    }
}

class FetchingAllStreamsInputExample {

    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientCreateExamples
                .getInputStreamClient(new Credentials("Place your username here", "Place your password here"));

        List<InputEndpoint> fetchedStream = inputStreamClient.getInputs();

        fetchedStream.forEach(System.out::println);
    }
}
