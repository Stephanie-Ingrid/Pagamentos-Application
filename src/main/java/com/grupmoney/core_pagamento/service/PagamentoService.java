package com.grupmoney.core_pagamento.service;

import com.grupmoney.core_pagamento.integration.model.PagamentoDTO;

public interface PagamentoService {

    PagamentoDTO realizaPagamento(PagamentoDTO pagamentoDTO);
}
