package com.ceeblue.streamingcloud.sdk.examples.apiclients;

import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClient;
import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClientImplementation;
import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
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

public class ApiClientCreateExamples {

    public static InputStreamClient getInputStreamClient(Credentials credentials) {
        HttpClient httpClient = HttpClientExample.getHttpCClient();
        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        return new InputApiClientImplementation(authenticationClient, httpClient);
    }

    public static OutputStreamClient getOutputStreamClient(Credentials credentials) {
        HttpClient httpClient = HttpClientExample.getHttpCClient();
        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        return new OutputApiClientImplementation(authenticationClient, httpClient);
    }

    public static StorageClient getStorageClient(Credentials credentials) {
        HttpClient httpClient = HttpClientExample.getHttpCClient();
        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        return new StorageClientImplementation(authenticationClient, httpClient);
    }

    public static RecordingClient getRecordingClient(Credentials credentials) {
        HttpClient httpClient = HttpClientExample.getHttpCClient();
        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        return new RecordingClientImplementation(authenticationClient, httpClient);
    }

    public static SnapshotClient getSnapshotClient(Credentials credentials) {
        HttpClient httpClient = HttpClientExample.getHttpCClient();
        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        return new SnapshotClientImplementation(authenticationClient, httpClient);
    }

    public static StreamPushClient getPushClient(Credentials credentials) {
        HttpClient httpClient = HttpClientExample.getHttpCClient();
        AuthenticationClient authenticationClient = new AuthenticationClientImplementation(credentials, httpClient);
        return new ApiPushClientImplementation(authenticationClient, httpClient);
    }
}
