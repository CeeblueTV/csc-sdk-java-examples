package com.ceeblue.streamingcloud.sdk.examples.authentication;

import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClient;
import com.ceeblue.streamingcloud.sdk.authentiffication.AuthenticationClientImplementation;
import com.ceeblue.streamingcloud.sdk.examples.httpClient.HttpClientExample;
import com.ceeblue.streamingcloud.sdk.settings.Credential;

public class AuthenticationExample {
    public static AuthenticationClient getAuthInstance() {
        Credential credentials = new Credential();
        credentials.setUsername("vladyslav");
        credentials.setPassword("sudosugo");
        return new AuthenticationClientImplementation(credentials, HttpClientExample.getHttpCClient());
    }

}
