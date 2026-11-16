
# 🧁 Loja de Cupcakes

Projeto Integrador Transdisciplinar II  
Curso de Engenharia de Software — Universidade Cruzeiro do Sul (Unicsul)

## 📋 Sobre o projeto

Sistema web desenvolvido para simular uma loja virtual de cupcakes.

O sistema permite que clientes consultem os produtos disponíveis e realizem pedidos, enquanto o administrador pode visualizar os pedidos registrados.

## 💻 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- HTML5
- CSS3
- JavaScript

## ⚙️ Funcionalidades

- Visualização dos cupcakes disponíveis
- Seleção de produtos e quantidades
- Cadastro de pedidos
- Cálculo automático do valor total
- Escolha da forma de pagamento
- Confirmação de pedidos
- Consulta administrativa dos pedidos

**Observação:** os pagamentos são simulados. O sistema não realiza transações financeiras reais.

## 🚀 Como executar

1. Instale o Java 21 e o MySQL.
2. Crie um banco de dados chamado `loja_cupcakes`.
3. Configure as credenciais do MySQL por meio das variáveis de ambiente `DB_USERNAME` e `DB_PASSWORD`.
4. Execute o projeto com Maven:

   mvnw.cmd spring-boot:run

5. Acesse a loja em:
   http://localhost:8080/

6. Acesse a página administrativa em:
   http://localhost:8080/admin.html

## 🎓 Finalidade acadêmica

Projeto desenvolvido como atividade acadêmica do curso de Engenharia de Software da Universidade Cruzeiro do Sul.

O sistema é um protótipo educacional e não está preparado para utilização comercial.


## Arquitetura do Sistema — Padrão MVC

O sistema Loja de Cupcakes foi desenvolvido utilizando
Java com Spring Boot, seguindo os princípios do padrão
arquitetural MVC (Model–View–Controller).

Esse padrão permite separar as responsabilidades da
aplicação, facilitando a organização, a manutenção
e a evolução do código.

### Model (Modelo)

Representa os dados e as regras de negócio da aplicação.

Principais classes:
- Cupcake.java: representa os produtos disponíveis.
- Pedido.java: representa os pedidos realizados.

A persistência dos dados é realizada por meio do
Spring Data JPA, utilizando os repositórios:
- CupcakeRepository.java
- PedidoRepository.java

O banco de dados utilizado é o MySQL.

### View (Visão)

É responsável pela interação com o usuário.

A interface foi desenvolvida com HTML, CSS e JavaScript.

Principais arquivos:
- index.html: página inicial da loja e realização de pedidos.
- admin.html: página administrativa para consulta de pedidos.
- style.css: estilização da interface.

### Controller (Controlador)

Recebe e processa as requisições HTTP enviadas pelo
frontend, realizando as operações necessárias.

Principais classes:
- CupcakeController.java: gerencia as operações
  relacionadas aos cupcakes.
- PedidoController.java: processa pedidos, realiza
  validações e calcula o valor total das compras.

### Fluxo de funcionamento

1. O cliente acessa a interface da loja (View).
2. O frontend envia uma requisição HTTP ao Controller.
3. O Controller processa a solicitação e utiliza
   as entidades e os repositórios do Model.
4. Os dados são consultados ou armazenados no MySQL.
5. O Controller retorna uma resposta à interface.
6. A View apresenta o resultado ao usuário.

### Benefícios da arquitetura

- Separação de responsabilidades.
- Melhor organização do código-fonte.
- Facilidade de manutenção.
- Reutilização de componentes.
- Maior facilidade para realizar testes.

A aplicação utiliza uma API REST com Spring Boot,
mantendo o frontend separado da lógica de processamento
e persistência dos dados.


