-- Inserindo estados
INSERT INTO estado (id, nome) VALUES (1, 'Paraná');
INSERT INTO estado (id, nome) VALUES (2, 'São Paulo');

-- Inserindo cidades
INSERT INTO cidade (id, nome, estado_id) VALUES (1, 'Londrina', 1);
INSERT INTO cidade (id, nome, estado_id) VALUES (2, 'Maringá', 1);
INSERT INTO cidade (id, nome, estado_id) VALUES (3, 'Campinas', 2);

-- Inserindo cozinhas
INSERT INTO cozinhas (id, nome) VALUES (1, 'Brasileira');
INSERT INTO cozinhas (id, nome) VALUES (2, 'Italiana');

-- Inserindo formas de pagamento
INSERT INTO forma_pagamento (id, descricao) VALUES (1, 'Dinheiro');
INSERT INTO forma_pagamento (id, descricao) VALUES (2, 'Cartão de Crédito');

-- Inserindo restaurantes
INSERT INTO restaurantes (id, nome, taxa_frete, cozinha_id) VALUES (1, 'Restaurante Bom Sabor', 5.50, 1);
INSERT INTO restaurantes (id, nome, taxa_frete, cozinha_id) VALUES (2, 'La Pasta', 10.00, 2);

