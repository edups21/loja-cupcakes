
# Manual do Usuário — Loja de Cupcakes

## 1. Apresentação

A Loja de Cupcakes é um sistema web desenvolvido
como parte do Projeto Integrador Transdisciplinar II
do curso de Engenharia de Software da Universidade
Cruzeiro do Sul.

O sistema permite visualizar cupcakes, realizar
pedidos e consultar os pedidos registrados.

## 2. Requisitos para execução local

- Java 21
- MySQL
- Banco de dados loja_cupcakes
- Aplicação Spring Boot em execução
- Navegador de internet

## 3. Acessar a loja

Com a aplicação em execução, abra o navegador e
acesse:

http://localhost:8080/

A página inicial apresenta os cupcakes disponíveis,
com seus nomes e preços.

## 4. Realizar um pedido

1. Acesse a página inicial.
2. Escolha o sabor de cupcake desejado.
3. Informe a quantidade.
4. Digite o nome do cliente.
5. Selecione uma forma de pagamento:
   PIX, CARTAO ou DINHEIRO.
6. Confirme o pedido.
7. Aguarde a mensagem de confirmação.

O sistema calcula automaticamente o valor total
do pedido.

Observação: cada pedido contém um único sabor de
cupcake, podendo ter várias unidades.

## 5. Consultar pedidos

Para acessar a página administrativa, digite:

http://localhost:8080/admin.html

A página permite consultar os pedidos registrados,
incluindo:

- Nome do cliente
- Cupcake escolhido
- Quantidade
- Valor total
- Forma de pagamento
- Status do pedido

## 6. Regras e validações

O sistema verifica os dados recebidos antes de
registrar um pedido.

Entre as validações implementadas estão:

- Nome do cliente obrigatório
- Quantidade válida
- Cupcake existente
- Forma de pagamento permitida

Pedidos válidos são registrados com o status
RECEBIDO.

## 7. Limitações do protótipo

- O pagamento é apenas simulado.
- Não existe integração com instituições financeiras.
- Cada pedido contém apenas um sabor de cupcake.
- A página administrativa não possui autenticação.
- A aplicação depende de um servidor local e
  de conexão com o banco de dados.

## 8. Finalidade

Este sistema foi desenvolvido exclusivamente
para fins acadêmicos e demonstração de conceitos
de Engenharia de Software.
