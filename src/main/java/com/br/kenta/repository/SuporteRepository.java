package com.br.kenta.repository;

import com.br.kenta.model.Suporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SuporteRepository extends JpaRepository<Suporte, Long> {
}
