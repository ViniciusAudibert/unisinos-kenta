package com.br.kenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.kenta.model.Chamado;

public interface TicketRepository extends JpaRepository<Chamado, Long> {
	Chamado findByName(String name);
}