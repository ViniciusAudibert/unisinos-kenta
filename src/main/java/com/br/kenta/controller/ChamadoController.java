package com.br.kenta.controller;

import com.br.kenta.model.Chamado;
import com.br.kenta.repository.ChamadoRepository;
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
class ChamadoController {

    @Autowired
    private ChamadoRepository chamadoRepository;

    @GetMapping("/chamado")
    Collection<Chamado> listAll() {
        return chamadoRepository.findAll();
    }

    @GetMapping("/chamado/{id}")
    ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Chamado> chamado = chamadoRepository.findById(id);
        return chamado.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/chamado")
    ResponseEntity<Chamado> create(@Valid @RequestBody Chamado chamado) throws URISyntaxException {
        Chamado result = chamadoRepository.save(chamado);
        return ResponseEntity.created(new URI("/api/chamado/" + result.getId()))
                .body(result);
    }

    @PutMapping("/chamado/{id}")
    ResponseEntity<Chamado> update(@Valid @RequestBody Chamado chamado) {
        Chamado result = chamadoRepository.save(chamado);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/chamado/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        chamadoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}