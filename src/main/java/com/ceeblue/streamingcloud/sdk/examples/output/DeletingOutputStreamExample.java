package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.models.Access;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.CreatedInput;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;

public class DeletingOutputStreamExample {

    public static void main(String[] args) {
        String streamId = "Place your output streamId here";

        try {
            OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

            outputStreamClient.deleteOutput(streamId);
        } catch (ClientException exception) {
            System.out.println("Something went wrong: " + exception);
        }
    }

}

class DeletingOutputSessionExample {

    public static void main(String[] args) {
        String streamId = "Place your input streamId here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        try {
            outputStreamClient.deleteOutputSessions(streamId);
        } catch (ClientException exception) {
            System.out.println("Something went wrong: " + exception);
        }
    }

}
