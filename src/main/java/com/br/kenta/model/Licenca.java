package com.br.kenta.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "produto")
public class Licenca {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Produto produto;
    private int nroSerie;

    @Temporal(TemporalType.DATE)
    private Date dataAtivacao;

    @Temporal(TemporalType.DATE)
    private Date dataExpiracao;

    private String situacao;
    private String nomePc;
}
