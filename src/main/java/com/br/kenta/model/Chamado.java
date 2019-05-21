package com.br.kenta.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "chamado")
public class Chamado {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dataAbertura;

    @ManyToOne
    private Usuario abertoPor;

    private Produto produto;
    private Suporte responsavel;
    private String categoria;
    private int origemRequisicao;
    private String descricao;
    private byte[] anexo;
    private String comentarios;
    private String situacao;
    private String prioridade;

    public void anexarDocumento(File anexo) throws IOException {
        byte[] bytes = new byte[(int) anexo.length()];
        InputStream is = new FileInputStream(anexo);
        is.read(bytes);
        is.close();

        this.anexo = bytes;
    }
}