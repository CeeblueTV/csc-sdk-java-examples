package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;

public class DeletingStorageExample {

    public static void main(String[] args) {
        String storageId = "place your storage id here";

        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        try {
            storageClient.deleteStorage(storageId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
