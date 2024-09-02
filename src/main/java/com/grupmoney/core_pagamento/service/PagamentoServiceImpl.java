package com.grupmoney.core_pagamento.service;

import com.grupmoney.core_pagamento.entity.Pagamento;
import com.grupmoney.core_pagamento.integration.model.PagamentoDTO;
import com.grupmoney.core_pagamento.repository.PagamentoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class PagamentoServiceImpl implements PagamentoService{

    private PagamentoRepository pagamentoRepository;

    private ModelMapper modelMapper;

    @Override
    public PagamentoDTO realizaPagamento(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = modelMapper.map(pagamentoDTO, Pagamento.class);

        pagamento.setDataPagamento(LocalDateTime.now());

        pagamentoRepository.save(pagamento) ;

        return modelMapper.map(pagamento, PagamentoDTO.class);
    }
}
