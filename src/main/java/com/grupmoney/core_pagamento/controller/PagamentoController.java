package com.grupmoney.core_pagamento.controller;

import com.grupmoney.core_pagamento.integration.model.PagamentoDTO;
import com.grupmoney.core_pagamento.service.PagamentoService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@AllArgsConstructor
@RequestMapping("/pagamento")
public class PagamentoController {

    private PagamentoService pagamentoService;

    @PostMapping
    @ResponseStatus(CREATED)
    @ApiResponse(responseCode = "201", content = @Content)
    public PagamentoDTO pagamento(@RequestBody @Valid PagamentoDTO pagamentoDTO) {

        return pagamentoService.realizaPagamento(pagamentoDTO);
    }
}
