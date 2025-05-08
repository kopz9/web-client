package me.kopz.webclient.controller;

import me.kopz.webclient.domain.Character;
import me.kopz.webclient.service.WebClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/personagem")
public class WebClientController {

  private final WebClientService service;

  public WebClientController(WebClientService service){
    this.service = service;
  }

  @GetMapping("/{id}")
  public Mono<Character> consultarPersonagemPorId(@PathVariable Long id){
    return service.consultarPersonagemPorId(id);
  }
}