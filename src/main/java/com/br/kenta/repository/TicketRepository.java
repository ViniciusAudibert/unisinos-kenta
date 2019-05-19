package com.br.kenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.kenta.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
	Ticket findByName(String name);
}