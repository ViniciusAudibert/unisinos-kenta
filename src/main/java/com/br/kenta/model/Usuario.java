package com.br.kenta.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
abstract public class Usuario {

    @Id
    @GeneratedValue
    protected Long id;

    protected String email;
    protected String login;
    protected String senha;
}