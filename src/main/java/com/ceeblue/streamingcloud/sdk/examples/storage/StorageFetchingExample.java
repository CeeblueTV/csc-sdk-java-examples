package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientCreateExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3;

import java.util.List;

public class StorageFetchingExample {

    public static void main(String[] args) {
        String storageId = "Place your storage id here";

        StorageClient storageClient = ApiClientCreateExamples
                .getStorageClient(new Credentials("Place your username here", "Place your password here"));

        try {
            AmazonS3 storage = storageClient.getStorage(storageId);

            System.out.println(storage);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}

class StoragesListExample {

    public static void main(String[] args) {
        StorageClient storageClient = ApiClientCreateExamples
                .getStorageClient(new Credentials("Place your username here", "Place your password here"));

        try {
            List<AmazonS3> storages = storageClient.getStorages();

            System.out.println("Results: ");
            storages.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
