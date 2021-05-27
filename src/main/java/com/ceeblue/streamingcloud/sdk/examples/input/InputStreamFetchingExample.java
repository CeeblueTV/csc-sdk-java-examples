package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.CreatedInput;

import java.util.List;

public class InputStreamFetchingExample {
    public static void main(String[] args) {
        String streamId = "Place your streamId here";

        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        CreatedInput fetchedStream = inputStreamClient.getInput(streamId);

        System.out.println(fetchedStream);
    }


}

class FetchingAllInputStreamsExample {
    public static void main(String[] args) {
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        List<CreatedInput> fetchedStream = inputStreamClient.getInputs();

        System.out.println(fetchedStream);
    }
}