
# Dicionário de Dados — Loja de Cupcakes

## 1. Objetivo

Documentar a estrutura física do banco de dados
loja_cupcakes, utilizado pelo sistema de vendas
de cupcakes.

SGBD: MySQL

## 2. Tabela cupcake

Armazena os produtos disponíveis na loja.

| Campo | Tipo | Aceita NULL | Descrição |
|---|---|---|---|
| id | BIGINT(20) | Não | Identificador único do cupcake |
| descricao | VARCHAR(255) | Sim | Descrição do produto |
| nome | VARCHAR(255) | Sim | Nome do cupcake |
| preco | DOUBLE | Sim | Preço unitário do cupcake |

Chave primária: id
Geração do ID: AUTO_INCREMENT

## 3. Tabela pedido

Armazena os pedidos realizados pelos clientes.

| Campo | Tipo | Aceita NULL | Descrição |
|---|---|---|---|
| id | BIGINT(20) | Não | Identificador único do pedido |
| cupcake_id | BIGINT(20) | Sim | ID do cupcake escolhido |
| forma_pagamento | VARCHAR(255) | Sim | Forma de pagamento selecionada |
| nome_cliente | VARCHAR(255) | Sim | Nome informado pelo cliente |
| quantidade | INT(11) | Sim | Quantidade de cupcakes solicitada |
| status | VARCHAR(255) | Sim | Situação do pedido |
| valor_total | DOUBLE | Sim | Valor total calculado |

Chave primária: id
Geração do ID: AUTO_INCREMENT

## 4. Relacionamento entre tabelas

O campo pedido.cupcake_id armazena o identificador
do cupcake associado ao pedido.

O relacionamento é tratado pela aplicação Java.

Na estrutura consultada, cupcake_id não apresenta
uma chave estrangeira declarada.

## 5. Regras de negócio

- O cliente seleciona um cupcake por pedido.
- O cliente informa seu nome e a quantidade.
- O sistema calcula o valor total automaticamente.
- As formas de pagamento aceitas são PIX,
  CARTAO e DINHEIRO.
- Os pagamentos são apenas simulados.
- Pedidos válidos são registrados com status RECEBIDO.

As validações são realizadas pela aplicação.
A estrutura consultada permite valores NULL
em diversos campos.

## 6. Observações técnicas

- Os campos monetários utilizam DOUBLE.
- Os identificadores são gerados automaticamente.
- O banco é acessado pela aplicação Spring Boot
  utilizando Spring Data JPA.
- A estrutura foi conferida com os comandos
  DESCRIBE cupcake e DESCRIBE pedido.
