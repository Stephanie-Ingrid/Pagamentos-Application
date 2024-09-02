CREATE TABLE pagamento(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_emprestimo INTEGER REFERENCES emprestimo (id),
    valor_emprestimo DECIMAL(18,4) NOT NULL,
    chave_pix VARCHAR (100) NOT NULL,
    data_pagamento DATE NOT NULL
);