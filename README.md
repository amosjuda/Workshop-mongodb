# Projeto MongoDB com Spring Boot

Este projeto é um estudo aprofundado sobre a integração do **MongoDB** com aplicações **Spring Boot**, abordando desde os conceitos fundamentais de bancos de dados orientados a documentos até a implementação de operações CRUD complexas e consultas avançadas.

---

## Objetivo Geral

O principal objetivo deste projeto foi compreender e aplicar as seguintes habilidades e conceitos:

* **Diferenças entre Paradigmas:** Entender as principais distinções entre bancos de dados **orientados a documentos (NoSQL)** e **relacionais (SQL)**.
* **Operações CRUD:** Implementar as operações básicas de **Criar (Create), Ler (Read), Atualizar (Update)** e **Deletar (Delete)** em um ambiente MongoDB com Spring Boot.
* **Decisões de Design:** Refletir sobre as melhores práticas e decisões de design para um banco de dados orientado a documentos.
* **Associações entre Objetos:** Implementar diferentes tipos de associações entre objetos, incluindo:
    * **Objetos Aninhados:** Incorporar documentos uns dentro dos outros.
    * **Referências:** Estabelecer links entre documentos separados.
* **Consultas com Spring Data:** Realizar consultas eficientes utilizando **Spring Data** e **MongoRepository**.

---

## Tecnologias Utilizadas

* **Java**
* **Spring Boot** (com compatibilidade para versões 1.5.x e 2.x.x)
* **MongoDB** (Banco de Dados NoSQL orientado a documentos)
* **Maven** (Gerenciador de Dependências)
* **Spring Data MongoDB**
* **RESTful APIs**

---

## Conceitos Aprendidos e Implementados

Durante o desenvolvimento deste projeto, os seguintes conceitos e funcionalidades foram explorados e aplicados:

* **Instalação e Configuração do MongoDB:** Procedimentos detalhados para instalação do MongoDB Community Server em ambientes Windows e macOS, incluindo a configuração do PATH e inicialização do `mongod`.
* **Estrutura Inicial do Projeto Spring Boot:** Criação de um projeto Spring Starter com a dependência `Spring Web`.
* **Entidades e Mapeamento (`@Document`, `@Id`):** Definição de classes de domínio (`User`, `Post`) e mapeamento para coleções MongoDB utilizando anotações.
* **Camada de Repositório (`MongoRepository`):** Criação de interfaces de repositório para acesso a dados, estendendo `MongoRepository`.
* **Camada de Serviço:** Implementação da lógica de negócio, orquestrando as operações de repositório.
* **Camada de Recurso (REST Controllers):** Criação de endpoints RESTful para expor as funcionalidades da aplicação.
* **DTO (Data Transfer Object):** Utilização do padrão DTO para otimizar o tráfego de dados, evitar exposição de dados sensíveis e customizar as respostas das requisições. Exemplos incluem `UserDTO`, `AuthorDTO` e `CommentDTO`.
* **Tratamento de Exceções:** Implementação de um tratamento de exceções global para a API REST, utilizando `@ControllerAdvice` e classes como `ObjectNotFoundException`, `StandardError` e `ResourceExceptionHandler`.
* **Operações CRUD Completas:**
    * **Inserção (POST):** Criação de novos usuários e posts.
    * **Busca por ID (GET):** Recuperação de um usuário ou post específico.
    * **Deleção (DELETE):** Remoção de usuários.
    * **Atualização (PUT):** Modificação de dados de usuários.
* **Associações entre Objetos:**
    * **Objetos Aninhados:** Implementação de `AuthorDTO` e `CommentDTO` aninhados dentro de `Post`.
    * **Referências (`@DBRef`):** Estabelecimento de referências entre `User` (usuário) e `Post` (postagem), onde um usuário pode ter uma lista de posts.
* **Instanciação da Base de Dados:** Criação de uma classe de configuração (`Instantiation`) que implementa `CommandLineRunner` para popular a base de dados com dados iniciais ao iniciar a aplicação.
* **Consultas Avançadas com Spring Data MongoDB:**
    * **Query Methods:** Definição de métodos de consulta diretamente na interface do repositório (ex: buscar posts por título).
    * **`@Query` Annotation:** Utilização da anotação `@Query` para escrever consultas MongoDB mais complexas usando a sintaxe JSON do MongoDB (ex: buscar posts por título com regex).
    * **Consultas com Múltiplos Critérios:** Implementação de consultas que combinam múltiplos critérios (ex: buscar posts por string em título/corpo/comentários e intervalo de datas).
* **Utilitários para URL:** Criação de uma classe utilitária (`URL`) para decodificar parâmetros de URL e tratar datas recebidas.
