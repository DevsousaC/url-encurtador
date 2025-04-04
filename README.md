# Encurtador de URLs

Este projeto é uma API RESTful simples para encurtar URLs longas e redirecionar para as URLs originais usando URLs encurtadas.

## Funcionalidades

* **Encurtamento de URLs:**
    * Recebe uma URL longa via cabeçalho HTTP (`url`).
    * Gera uma URL curta correspondente.
* **Redirecionamento de URLs:**
    * Redireciona para a URL original quando uma URL curta é acessada.

## Tecnologias Utilizadas

* **Java:** Linguagem de programação principal.
* **Spring Boot:** Framework para desenvolvimento rápido de aplicações Java.
* **JPA (Java Persistence API):** API para mapeamento objeto-relacional.
* **PostgreSQL:** Banco de dados relacional.
* **Maven:** Ferramentas de construção e gerenciamento de dependências.
* **RESTful APIs:** Arquitetura para criação de serviços web.
* **Docker:** Plataforma de conteinerização.
* **Postman:** Ferramenta para testes de API.
* **Git e GitHub:** Versionamento de código.

## Pré-requisitos

* Java 17 ou superior
* Maven ou Gradle
* Docker (opcional)
* PostgreSQL

## Como Executar

1.  **Clone o repositório:**

    ```bash
    git clone [https://github.com/dolthub/dolt](https://github.com/dolthub/dolt)
    ```

2.  **Navegue até o diretório do projeto:**

    ```bash
    cd [nome do projeto]
    ```

3.  **Execute a aplicação:**

    * **Com Maven:**

        ```bash
        ./mvnw spring-boot:run
        ```

    * **Com Gradle:**

        ```bash
        ./gradlew bootRun
        ```

4.  **Acesse a API:**

    A API estará disponível em `http://localhost:8081`.

## Endpoints

* **Encurtar URL:**

    * `POST /url/encurtar`
    * body: `https://www.merriam-webster.com/dictionary/longa`
    * Retorna: URL encurtada

* **Redirecionar URL:**

    * `GET /url/{urlEncurtada}`
    * Redireciona para a URL original.

## Testes

Utilize o Postman para testar os endpoints da API.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Autor

Diego Sousa de Carvalho

[Meu LinkedIn](https://www.linkedin.com/in/devdiego/)
