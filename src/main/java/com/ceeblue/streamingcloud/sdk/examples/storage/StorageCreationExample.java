package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3Compatible;

public class StorageCreationExample {

    public static void main(String[] args) {
        StorageClient storageClient = ApiClientCreateExamples
                .getStorageClient(new Credentials("Place your username here", "Place your password here"));

        try {
            AmazonS3Compatible storage = new AmazonS3Compatible("Storage name", "AK...............PU", "GW.............................f+", "test-recordings", "google..com");
            AmazonS3Compatible createdStorage = (AmazonS3Compatible) storageClient.createStorage(storage);

            System.out.println(createdStorage);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
