package me.kopz.webclient.client;

import me.kopz.webclient.domain.Character;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;


@Component
public class RickMortyClient {

  private final WebClient webClient;

  public RickMortyClient(WebClient webClient) {
    this.webClient = webClient;
  }

  public Mono<Character> findCharacterById(Long id){

    return webClient
        .get()
        .uri("/character/".concat(id.toString()))
        .accept(APPLICATION_JSON)
        .retrieve()
        .onStatus(HttpStatusCode::is4xxClientError, error -> Mono.error(new RuntimeException("Please specify a valid ID")))
        .bodyToMono(Character.class);
  }
}
