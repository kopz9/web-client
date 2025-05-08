package me.kopz.webclient.service;

import me.kopz.webclient.client.RickMortyClient;
import me.kopz.webclient.domain.Character;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

  private final RickMortyClient rickMortyClient;

  public WebClientService(RickMortyClient rickMortyClient){
    this.rickMortyClient = rickMortyClient;
  }

  public Mono<Character> consultarPersonagemPorId(Long id){
    return rickMortyClient.findCharacterById(id);
  }
}