package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.OutputSettings;

public class OutputSettingsExample {

    public static void main(String[] args) {
        String streamId = "Place your streamId here";
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        try {
            OutputSettings output = inputStreamClient.getOutputSettings(streamId);
            System.out.println("Current output settings: " + output);

            OutputSettings updatedOutput = inputStreamClient.updateOutputSettings(streamId, output.setPassthrough(true));
            System.out.println("Updated output settings: " + updatedOutput);
            OutputSettings updatedOutput = inputStreamClient.updateOutputSettings(streamId, output.setPassthrough(true));

            System.out.println(updatedOutput);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
