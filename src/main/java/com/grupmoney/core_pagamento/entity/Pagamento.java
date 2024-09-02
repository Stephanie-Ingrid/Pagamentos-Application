package com.grupmoney.core_pagamento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_emprestimo")
    private Long idEmprestimo;

    @Column(name = "valor_emprestimo")
    private BigDecimal valorPagamento;

    @Column(name = "chave_pix")
    private String chavePix;

    @Column(name = "data_pagamento")
    private LocalDateTime DataPagamento;


}
