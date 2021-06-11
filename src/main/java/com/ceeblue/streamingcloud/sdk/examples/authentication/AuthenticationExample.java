package com.ceeblue.streamingcloud.sdk.examples.authentication;

import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClient;
import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClientImplementation;
import com.ceeblue.streamingcloud.sdk.authentiffication.Credentials;
import com.ceeblue.streamingcloud.sdk.examples.httpClient.HttpClientExample;

public class AuthenticationExample {

    public static AuthenticationClient getAuthInstance() {
        Credentials credentials = new Credentials("vladyslav", "sudosugo");

        return new AuthenticationClientImplementation(credentials, HttpClientExample.getHttpCClient());
    }

}
