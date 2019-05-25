package com.br.kenta.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gravacao")
public class Gravacao {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToOne
    private Cliente cliente;

    private byte[] gravacao;

    public void adicionarGravacao(File gravacao) throws IOException {
        byte[] bytes = new byte[(int) gravacao.length()];
        InputStream is = new FileInputStream(gravacao);
        is.read(bytes);
        is.close();

        this.gravacao = bytes;
    }
}