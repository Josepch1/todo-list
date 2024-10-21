# 📝 TODO List

![Concluído](https://img.shields.io/badge/Status-Concluido-28a745?style=for-the-badge)
![Backend](https://img.shields.io/badge/Tipo-Backend-8257E5?style=for-the-badge)

> API (CRUD) para gerenciar tarefas.

## 🚀 Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [PostgreSQL](https://www.postgresql.org/download/)

## 🛠️ Práticas Adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## 💻 Como Executar

- Clonar o repositório:

```bash
git clone https://github.com/Josepch1/todo-list.git
```

- Construir o projeto:

```bash
./mvnw clean package
```

- Executar a aplicação:

```bash
java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

### A API poderá ser acessada em
  
- Requisições HTTP: [http://localhost/](http://localhost/)
- O Swagger estará disponível em: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 🔥 Endpoints da API

> Para as requisições HTTP, utilizamos CLI do [HTTPIe](https://httpie.io/cli)

- Criar Tarefa:

```bash
http POST :8080/todos nome="Todo 1" descricao="Descrição 1" prioridade=1

[
  {
    "descricao": "Descrição 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Listar Tarefas:

```bash
http GET :8080/todos

[
  {
    "descricao": "Descrição 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Atualizar Tarefa:

```bash
http PUT :8080/todos/1 nome="Todo 1 Atualizado" descricao="Descrição Atualizada" prioridade=2

[
  {
    "descricao": "Descrição Atualizada",
    "id": 1,
    "nome": "Todo 1 Atualizado",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remover Tarefa:

```bash
http DELETE :8080/todos/1

[]
```

## 📋 Funcionalidades

- Adicionar, listar, atualizar e remover tarefas.
- Atribuir prioridades às tarefas.
- Marcar tarefas como realizadas ou pendentes.
