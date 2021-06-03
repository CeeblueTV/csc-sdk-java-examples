package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.exceptions.ClientException;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3;

import java.util.List;

public class FetchingStorageExample {

    public static void main(String[] args) {
        String storageId = "Place your storage id here";

        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        try {
            AmazonS3 storage = storageClient.getStorage(storageId);

            System.out.println(storage);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}

class ListStoragesExample {

    public static void main(String[] args) {
        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        try {
            List <AmazonS3> storages = storageClient.getStorages();

            storages.forEach(System.out::println);
        } catch (ClientException exception) {
            System.err.println("Something went wrong: " + exception);
        }
    }
}
