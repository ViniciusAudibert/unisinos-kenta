package com.br.kenta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;
import com.br.kenta.model.Ticket;
import com.br.kenta.repository.TicketRepository;

@RestController
@RequestMapping("/api")
class GroupController {

	private final Logger log = LoggerFactory.getLogger(GroupController.class);
	private TicketRepository groupRepository;

	public GroupController(TicketRepository groupRepository) {
		this.groupRepository = groupRepository;
	}

	@GetMapping("/groups")
	Collection<Ticket> groups() {
		return groupRepository.findAll();
	}

	@GetMapping("/group/{id}")
	ResponseEntity<?> getGroup(@PathVariable Long id) {
		Optional<Ticket> group = groupRepository.findById(id);
		return group.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/group")
	ResponseEntity<Ticket> createGroup(@Valid @RequestBody Ticket group) throws URISyntaxException {
		log.info("Request to create group: {}", group);
		Ticket result = groupRepository.save(group);
		return ResponseEntity.created(new URI("/api/group/" + result.getId()))
				.body(result);
	}

	@PutMapping("/group/{id}")
	ResponseEntity<Ticket> updateGroup(@Valid @RequestBody Ticket group) {
		log.info("Request to update group: {}", group);
		Ticket result = groupRepository.save(group);
		return ResponseEntity.ok().body(result);
	}

	@DeleteMapping("/group/{id}")
	public ResponseEntity<?> deleteGroup(@PathVariable Long id) {
		log.info("Request to delete group: {}", id);
		groupRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
}