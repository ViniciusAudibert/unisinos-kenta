package com.br.kenta.repository;

import com.br.kenta.model.Gravacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface GravacaoRepository extends JpaRepository<Gravacao, Long> {
}
