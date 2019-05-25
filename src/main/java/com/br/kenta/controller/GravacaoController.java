package com.br.kenta.controller;

import com.br.kenta.model.Gravacao;
import com.br.kenta.repository.GravacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GravacaoController {
    @Autowired
    private GravacaoRepository gravacaoRepository;

    @GetMapping("/gravacao")
    Collection<Gravacao> listAll() {
        return gravacaoRepository.findAll();
    }

    @GetMapping("/gravacao/{id}")
    ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Gravacao> gravacao = gravacaoRepository.findById(id);
        return gravacao.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/gravacao")
    ResponseEntity<Gravacao> create(@Valid @RequestBody Gravacao gravacao) throws URISyntaxException {
        Gravacao result = gravacaoRepository.save(gravacao);
        return ResponseEntity.created(new URI("/api/gravacao/" + result.getId()))
                .body(result);
    }

    @PutMapping("/gravacao/{id}")
    ResponseEntity<Gravacao> update(@Valid @RequestBody Gravacao gravacao) {
        Gravacao result = gravacaoRepository.save(gravacao);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/gravacao/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        gravacaoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}