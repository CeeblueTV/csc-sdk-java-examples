package com.ceeblue.streamingcloud.sdk.examples.httpClient;

import com.ceeblue.streamingcloud.sdk.http.HttpClient;
import com.ceeblue.streamingcloud.sdk.http.template.HttpRestTemplate;
import com.ceeblue.streamingcloud.sdk.http.template.utils.RestTemplateResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

public class HttpClientExample {
    public static HttpClient getHttpCClient() {
        RestTemplate template = new RestTemplate();

        template.setErrorHandler(new RestTemplateResponseErrorHandler());

        return new HttpRestTemplate(template);
    }

}
