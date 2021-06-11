package com.ceeblue.streamingcloud.sdk.examples.apiclients;

import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClient;
import com.ceeblue.streamingcloud.sdk.examples.authentication.AuthenticationExample;
import com.ceeblue.streamingcloud.sdk.examples.httpClient.HttpClientExample;
import com.ceeblue.streamingcloud.sdk.http.HttpClient;
import com.ceeblue.streamingcloud.sdk.streams.input.InputApiClientImplementation;
import com.ceeblue.streamingcloud.sdk.streams.input.InputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputApiClientImplementation;
import com.ceeblue.streamingcloud.sdk.streams.output.OutputStreamClient;
import com.ceeblue.streamingcloud.sdk.streams.push.ApiPushClientImplementation;
import com.ceeblue.streamingcloud.sdk.streams.push.StreamPushClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClient;
import com.ceeblue.streamingcloud.sdk.streams.recording.RecordingClientImplementation;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClient;
import com.ceeblue.streamingcloud.sdk.streams.snapshot.SnapshotClientImplementation;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClient;
import com.ceeblue.streamingcloud.sdk.streams.storage.StorageClientImplementation;

public class ApiClientsCreationExamples {

    public static InputStreamClient getInputStreamClient() {
        HttpClient httpClient = HttpClientExample.getHttpCClient();

        AuthenticationClient authenticationClient = AuthenticationExample.getAuthInstance();
        return new InputApiClientImplementation(authenticationClient, httpClient);
    }

    public static OutputStreamClient getOutputStreamClient() {
        HttpClient httpClient = HttpClientExample.getHttpCClient();

        AuthenticationClient authenticationClient = AuthenticationExample.getAuthInstance();
        return new OutputApiClientImplementation(authenticationClient, httpClient);
    }

    public static StorageClient getStorageClient() {
        HttpClient httpClient = HttpClientExample.getHttpCClient();

        AuthenticationClient authenticationClient = AuthenticationExample.getAuthInstance();
        return new StorageClientImplementation(authenticationClient, httpClient);
    }

    public static RecordingClient getRecordingClient() {
        HttpClient httpClient = HttpClientExample.getHttpCClient();

        AuthenticationClient authenticationClient = AuthenticationExample.getAuthInstance();
        return new RecordingClientImplementation(authenticationClient, httpClient);
    }

    public static SnapshotClient getSnapshotClient() {
        HttpClient httpClient = HttpClientExample.getHttpCClient();

        AuthenticationClient authenticationClient = AuthenticationExample.getAuthInstance();
        return new SnapshotClientImplementation(authenticationClient, httpClient);
    }

    public static StreamPushClient getPushClient() {
        HttpClient httpClient = HttpClientExample.getHttpCClient();

        AuthenticationClient authenticationClient = AuthenticationExample.getAuthInstance();
        return new ApiPushClientImplementation(authenticationClient, httpClient);
    }

    public static void main(String[] args) {
        System.out.println(AuthenticationExample.getAuthInstance().authenticate().getToken());
    }

}
