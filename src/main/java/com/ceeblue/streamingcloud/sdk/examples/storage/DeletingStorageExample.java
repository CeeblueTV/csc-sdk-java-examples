package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;

public class DeletingStorageExample {

    public static void main(String[] args) {
        String storageId = "place your storage id here";

        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        storageClient.deleteStorage(storageId);
    }

}
