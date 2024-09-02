package com.grupmoney.core_pagamento.integration.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoDTO {

    @NotNull(message = "Campo idEmprestimo é obrigatório" )
    private Long idEmprestimo;

    @NotNull(message = "Campo valorPagamento é obrigatório")
    private BigDecimal valorPagamento;

    @NotNull(message = "Campo chavePix é obrigatório")
    private String chavePix;

}
