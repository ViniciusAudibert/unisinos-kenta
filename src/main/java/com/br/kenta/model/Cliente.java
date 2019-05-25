package com.br.kenta.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "cliente")
public class Cliente extends Usuario {
    @Id
    @GeneratedValue
    private Long id;

    private String cnpj;
    private String razaoSocial;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
}