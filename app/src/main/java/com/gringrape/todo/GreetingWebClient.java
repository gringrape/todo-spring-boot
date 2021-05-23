package com.gringrape.todo;

import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {
    private WebClient webClient = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = webClient.get()
            .uri("/hello")
            .exchange();
}
