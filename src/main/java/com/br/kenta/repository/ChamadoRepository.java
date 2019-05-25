package com.br.kenta.repository;

import com.br.kenta.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
}