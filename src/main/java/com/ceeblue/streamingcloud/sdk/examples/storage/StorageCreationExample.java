package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3Compatible;

public class StorageCreationExample {

    public static void main(String[] args) {
        AmazonS3Compatible storage = new AmazonS3Compatible("Storage name", "AK...............PU", "GW.............................f+", "test-recordings", "google..com");
        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();


        try {
            AmazonS3Compatible createdStorage = (AmazonS3Compatible) storageClient.createStorage(storage);

            System.out.println(createdStorage);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }

}
