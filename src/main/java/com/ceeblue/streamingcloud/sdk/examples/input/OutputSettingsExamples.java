package com.ceeblue.streamingcloud.sdk.examples.input;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.input.models.Access;
import com.ceeblue.streamingcloud.sdk.streams.input.models.OutputSettings;
import com.ceeblue.streamingcloud.sdk.streams.input.models.inputs.CreatedInput;

public class OutputSettingsExamples {

    public static void main(String[] args) {
        String streamId = "Place your streamId here";
        InputStreamClient inputStreamClient = ApiClientsCreationExamples.getInputStreamClient();

        try {
            OutputSettings output = inputStreamClient.getOutputSettings(streamId);

            System.out.println(output);

            OutputSettings updatedOutput = inputStreamClient.updateOutputSettings(streamId, output.setPassthrough(false));

            System.out.println(updatedOutput);
        } catch (ClientException exception) {
            System.out.println("Something went wrong: " + exception);
        }
    }

}
