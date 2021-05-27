package com.ceeblue.streamingcloud.sdk.examples.storage;

import com.ceeblue.streamingcloud.sdk.examples.apiclients.ApiClientsCreationExamples;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.models.storages.AmazonS3;

import java.util.List;

public class FetchingStorageExample {

    public static void main(String[] args) {
        String storageId = "Place your storage id here";

        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        AmazonS3 storage = storageClient.getStorage(storageId);

        System.out.println(storage);
    }
}

class fetchingAllStorages {
    public static void main(String[] args) {
        StorageClient storageClient = ApiClientsCreationExamples.getStorageClient();

        List<AmazonS3> storages = storageClient.getStorages();

        System.out.println(storages);
    }

}
