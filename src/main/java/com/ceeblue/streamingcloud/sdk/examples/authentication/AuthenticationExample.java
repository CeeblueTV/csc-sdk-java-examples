package com.ceeblue.streamingcloud.sdk.examples.authentication;

import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClient;
import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClientImplementation;
import com.ceeblue.streamingcloud.sdk.authentiffication.Credential;
import com.ceeblue.streamingcloud.sdk.examples.httpClient.HttpClientExample;


public class AuthenticationExample {
    public static AuthenticationClient getAuthInstance() {
        Credential credentials = new Credential();
        credentials.setUsername("vladyslav");
        credentials.setPassword("sudosugo");
        return new AuthenticationClientImplementation(credentials, HttpClientExample.getHttpCClient());
    }

}
