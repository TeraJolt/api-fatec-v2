INSERT INTO tb_cliente (nome,sobrenome,endereco,email) VALUES ('João','Santos','Rua 1', 'joao.santos@email.com');
INSERT INTO tb_cliente (nome,sobrenome,endereco,email) VALUES ('Marcio','Garcia','Rua 2', 'marcio.garcia@email.com');
INSERT INTO tb_cliente (nome,sobrenome,endereco,email) VALUES ('Guilherme','Melo','Rua 3', 'guilherme.melo@email.com');
INSERT INTO tb_cliente (nome,sobrenome,endereco,email) VALUES ('João','Neto','Rua 4', 'joao.neto@email.com');
INSERT INTO tb_cliente (nome,sobrenome,endereco,email) VALUES ('Paulo','Freire','Rua 5', 'paulo.freire@email.com');
INSERT INTO tb_cliente (nome,sobrenome,endereco,email) VALUES ('Alan','Daniel','Rua 6', 'alan.daniel@email.com');

INSERT INTO tb_produto (descricao,preco,quantidade_estoque,ativo) VALUES ('Teclado',60,40,'SIM');
INSERT INTO tb_produto (descricao,preco,quantidade_estoque,ativo) VALUES ('Mouse',50,40,'SIM');
INSERT INTO tb_produto (descricao,preco,quantidade_estoque,ativo) VALUES ('Fone',40,40,'SIM');

INSERT INTO tb_pedido_venda (emissao, total, status, cliente_id) VALUES ('2024-05-11',110, 'CONCLUIDO', 1);

INSERT INTO tb_pedido_venda_item (quantidade,valor_total,valor_unitario,pedido_venda_id,produto_id) VALUES ( 1, 60, 60, 1,1 );
INSERT INTO tb_pedido_venda_item (quantidade,valor_total,valor_unitario,pedido_venda_id,produto_id) VALUES ( 1, 50,50, 1,2 );

