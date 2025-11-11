-- =============================
-- Inserindo estados
-- =============================
INSERT INTO estado (id, nome) VALUES (1, 'Paraná');
INSERT INTO estado (id, nome) VALUES (2, 'São Paulo');

-- =============================
-- Inserindo cidades
-- =============================
INSERT INTO cidade (id, nome, estado_id) VALUES (1, 'Londrina', 1);
INSERT INTO cidade (id, nome, estado_id) VALUES (2, 'Maringá', 1);
INSERT INTO cidade (id, nome, estado_id) VALUES (3, 'Campinas', 2);

-- =============================
-- Inserindo cozinhas
-- =============================
INSERT INTO cozinhas (id, nome) VALUES (1, 'Brasileira');
INSERT INTO cozinhas (id, nome) VALUES (2, 'Italiana');

-- =============================
-- Inserindo formas de pagamento
-- =============================
INSERT INTO forma_pagamento (id, descricao) VALUES (1, 'Dinheiro');
INSERT INTO forma_pagamento (id, descricao) VALUES (2, 'Cartão de Crédito');

-- =============================
-- Inserindo endereços
-- =============================
INSERT INTO enderecos (id, cep, logradouro, numero, complemento, bairro) 
VALUES (1, '86010-000', 'Rua A', '123', 'Sala 1', 'Centro');

INSERT INTO enderecos (id, cep, logradouro, numero, complemento, bairro) 
VALUES (2, '13010-000', 'Avenida B', '456', NULL, 'Jardim Itália');

-- =============================
-- Inserindo restaurantes
-- =============================
INSERT INTO restaurantes (id, nome, taxa_frete, cozinha_id, endereco_id) 
VALUES (1, 'Restaurante Bom Sabor', 5.50, 1, 1);

INSERT INTO restaurantes (id, nome, taxa_frete, cozinha_id, endereco_id) 
VALUES (2, 'La Pasta', 10.00, 2, 2);

-- =============================
-- Relacionando restaurantes com formas de pagamento (ManyToMany)
-- =============================
INSERT INTO restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) VALUES (1, 1);
INSERT INTO restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) VALUES (1, 2);
INSERT INTO restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) VALUES (2, 2);



