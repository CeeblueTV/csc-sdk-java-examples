package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.InputEndpoint;

import java.util.List;

public class InputStreamFetchingExample {

    public static void main(String[] args) {
        String streamId = "e9ecff84-c989-41e5-ae34-24872eb0e3c9";

        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        try {
            InputEndpoint fetchedStream = inputStreamClient.getInput(streamId);
            System.out.println(fetchedStream);
        } catch (ClientException exception) {
            System.err.println("Hmm: " + exception);
        }
    }
}

class FetchingAllInputStreamsExample {

    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        List<InputEndpoint> fetchedStream = inputStreamClient.getInputs();

        fetchedStream.forEach(System.out::println);
    }
}
