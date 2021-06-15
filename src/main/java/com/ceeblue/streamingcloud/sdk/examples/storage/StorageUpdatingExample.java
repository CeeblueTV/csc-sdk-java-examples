package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3Compatible;

public class StorageUpdatingExample {

    public static void main(String[] args) {
        StorageClient storageClient = ApiClientCreateExamples
                .getStorageClient(new Credentials("Place your username here", "Place your password here"));

        // Existed storage from cloud
        AmazonS3Compatible storage = new AmazonS3Compatible("Your storage id", "AK...............PU", "GW.............................f+", "test-recordings", "Some endpoint");

        try {
            AmazonS3Compatible updatedStorage = (AmazonS3Compatible) storageClient.updateStorage(storage);

            System.out.println(updatedStorage);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
