package com.br.kenta;

import com.br.kenta.model.Cliente;
import com.br.kenta.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class Initializer implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void run(String... strings) {
        clienteRepository.save(
                Cliente.builder()
                        .bairro("Bairro Teste")
                        .cidade("Porto Alegre")
                        .cnpj("1223145512")
                        .endereco("Rua Teste de abril")
                        .numero(265)
                        .razaoSocial("Razão Teste")
                        .build()
        );

        clienteRepository.findAll().forEach(System.out::println);
    }
}