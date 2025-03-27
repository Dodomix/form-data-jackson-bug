package com.examle.formdatajacksonbug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class ControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void sendSmsPlain_GivenRequestBodyWithVariousMediaTypes_ThenReturnOk() {
        var webClientSpec = webTestClient.post().uri("/?param1=value1")
                .header(HttpHeaders.CONTENT_TYPE, "*/*")
                .bodyValue("notJson=someValue");

        WebTestClient.ResponseSpec exchange = webClientSpec.exchange();

        exchange.expectStatus().isOk();
    }
}
