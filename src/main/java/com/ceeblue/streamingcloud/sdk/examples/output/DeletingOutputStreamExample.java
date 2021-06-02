package com.ceeblue.streamingcloud.sdk.examples.output;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;

public class DeletingOutputStreamExample {
    public static void main(String[] args) {
        String streamId = "Place your output streamId here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        outputStreamClient.deleteOutput(streamId);
    }
}

class DeletingOutputSessionExample {
    public static void main(String[] args) {
        String streamId = "Place your input streamId here";

        OutputStreamClient outputStreamClient = ApiClientsCreationExamples.getOutputStreamClient();

        outputStreamClient.deleteOutputSessions(streamId);
    }
}
