package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;

public class StorageDeletingExample {

    public static void main(String[] args) {
        String storageId = "place your storage id here";

        try {
            StorageClient storageClient = ApiClientCreateExamples
                    .getStorageClient(new Credentials("Place your username here", "Place your password here"));

            storageClient.deleteStorage(storageId);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
