package com.br.kenta.repository;

import com.br.kenta.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
