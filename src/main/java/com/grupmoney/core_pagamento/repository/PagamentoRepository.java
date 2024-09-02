package com.grupmoney.core_pagamento.repository;

import com.grupmoney.core_pagamento.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
