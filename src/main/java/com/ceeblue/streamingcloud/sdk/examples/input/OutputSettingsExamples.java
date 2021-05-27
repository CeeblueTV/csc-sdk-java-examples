package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.OutputSettings;

public class OutputSettingsExamples {
    public static void main(String[] args) {
        String streamId = "Place your streamId here";
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        OutputSettings output = inputStreamClient.getOutputSettings(streamId);

        System.out.println(output);

        OutputSettings updatedOutput = inputStreamClient.updateOutputSettings(streamId, output.setPassthrough(false));

        System.out.println(updatedOutput);
    }
}
