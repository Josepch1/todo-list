<h1 align="center" id="title">📝 TODO List</h1>

![project-image](https://socialify.git.ci/Josepch1/todo-list/image?description=1&descriptionEditable=TODO%20List%20API%20using%20Spring%20Boot&language=1&name=1&owner=1&pattern=Solid&theme=Light)

<p align="center"><img src="https://img.shields.io/badge/Status-Concluido-28a745?style=for-the-badge" alt="shields"><img src="https://img.shields.io/badge/Tipo-Backend-8257E5?style=for-the-badge" alt="shields"></p>

<p align="center">API (CRUD) para gerenciar tarefas.</p>

## 🚀 Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [PostgreSQL](https://www.postgresql.org/download/)

## 🛠️ Práticas Adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## 💻 Pré-requisitos

Antes de executar a aplicação, certifique-se de que você tenha:

- Java JDK 23 ou superior
- Maven instalado
- Docker instalado (opcional, para PostgreSQL)

## 💻 Como Executar

### 1. Clonar o repositório

```bash
git clone https://github.com/Josepch1/todo-list.git
```

### 2. Construir o projeto

```bash
./mvnw clean package
```

### 3. Executar a aplicação

```bash
java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

### A API poderá ser acessada em

- Requisições HTTP: [http://localhost:8080/](http://localhost:8080/)
- O Swagger estará disponível em: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### 💾 Iniciar PostgreSQL com Docker

Para executar o PostgreSQL em um contêiner Docker, siga os passos abaixo:

#### 1. Executar o PostgreSQL em Docker

```bash
docker run --name todo-postgres -e POSTGRES_USER=USERNAME -e POSTGRES_PASSWORD=PASSWORD -e POSTGRES_DB=todos -p 5432:5432 -d postgres
```

- `--name`: Define o nome do contêiner (neste caso, `todo-postgres`).
- `-e POSTGRES_USER`: Configura o nome do usuário do banco de dados.
- `-e POSTGRES_PASSWORD`: Define a senha do usuário.
- `-e POSTGRES_DB`: Cria o banco de dados especificado ao iniciar o - contêiner.
- `-p 5432:5432`: Expõe a porta 5432 para conexão local com o PostgreSQL.
- `-d`: Executa o contêiner em modo "detached" (em segundo plano).

#### 2. Verificar se o contêiner está rodando

```bash
docker ps
```

#### 3. Configurar a conexão da aplicação com o PostgreSQL

Certifique-se de que o arquivo application.properties ou application.yml está configurado corretamente para se conectar ao banco de dados PostgreSQL. Aqui está um exemplo de configuração:

```properties
# Database
spring.datasource.url=jdbc:postgresql://localhost:5432/todos
spring.datasource.username=YOUR_USER
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=org.postgresql.Driver

#Hibernate
spring.jpa.hibernate.ddl-auto=update
```

Agora você está pronto para rodar a aplicação com o banco de dados PostgreSQL usando Docker!

## 🔥 Endpoints da API

> Para as requisições HTTP, utilizamos CLI do [HTTPIe](https://httpie.io/cli)

### Criar Tarefa

```bash
http POST :8080/todos name="Todo 1" description="Descrição 1" priority=1

[
  {
    "description": "Descrição 1",
    "id": 1,
    "name": "Todo 1",
    "priority": 1,
    "completed": false
  }
]
```

### Listar Tarefas

```bash
http GET :8080/todos

[
  {
    "description": "Descrição 1",
    "id": 1,
    "name": "Todo 1",
    "priority": 1,
    "completed": false
  }
]
```

### Atualizar Tarefa

```bash
http PUT :8080/todos/1 name="Todo 1 Atualizado" description="Descrição Atualizada" priority=2

[
  {
    "description": "Descrição Atualizada",
    "id": 1,
    "name": "Todo 1 Atualizado",
    "priority": 2,
    "completed": false
  }
]
```

### Remover Tarefa

```bash
http DELETE :8080/todos/1

[]
```

## 📋 Funcionalidades

- Adicionar, listar, atualizar e remover tarefas.
- Atribuir prioritys às tarefas.
- Marcar tarefas como realizadas ou pendentes.

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.
