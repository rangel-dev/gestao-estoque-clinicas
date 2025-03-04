# 🏥 Sistema de Gestão de Estoque para Clínicas-Escola

Este é um projeto para a criação de um **sistema de gestão de estoque** voltado para clínicas-escola da UNINASSAU. O objetivo é garantir um melhor controle de insumos, utilizando boas práticas de desenvolvimento e acessibilidade.

## 📌 Tecnologias Utilizadas

- **Frontend:** React.js  
- **Backend:** Java com Spring Boot  
- **Banco de Dados:** PostgreSQL  
- **Gerenciamento de Código:** GitHub  
- **Gerenciamento de Tarefas:** Trello  
- **Ferramentas Adicionais:** Docker, Postman  

---

## 🚀 Configuração do Ambiente de Desenvolvimento

### 1️⃣ Pré-requisitos
Antes de iniciar, instale as seguintes ferramentas:

- [Git](https://git-scm.com/)
- [Node.js](https://nodejs.org/)
- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Docker](https://www.docker.com/) (opcional)
- [Postman](https://www.postman.com/)
- [VS Code](https://code.visualstudio.com/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/)

---

### 2️⃣ Clonando o Repositório
Para obter o código-fonte, execute no terminal:

```sh
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

---

### 3️⃣ Configuração do Frontend (React)
Se estiver usando React, execute os seguintes comandos:

```sh
npx create-react-app frontend
cd frontend
npm install
npm start
```

Isso iniciará o servidor localmente na URL `http://localhost:3000`.

---

### 4️⃣ Configuração do Backend (Spring Boot)
1. Acesse [Spring Initializr](https://start.spring.io/) e gere um projeto com as dependências: **Spring Web**, **Spring Data JPA**, **PostgreSQL/MySQL** e **Lombok**.  
2. Extraia o projeto na pasta `backend` e, no terminal, execute:

```sh
cd backend
mvn clean install
mvn spring-boot:run
```

Se tudo estiver correto, o backend rodará na URL `http://localhost:8080`.

---

### 5️⃣ Configuração do Banco de Dados
Caso esteja utilizando **PostgreSQL**, siga as etapas abaixo:

1. Crie um banco de dados chamado `estoque_db`.
2. Configure as credenciais no arquivo `application.properties` do Spring Boot:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/estoque_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

Se quiser rodar o banco via **Docker**, utilize o seguinte comando:

```sh
docker run --name estoque_db -e POSTGRES_USER=usuario -e POSTGRES_PASSWORD=senha -p 5432:5432 -d postgres
```

---

### 6️⃣ Configuração do GitHub para Trabalho em Equipe
Para trabalhar com branches, siga estes passos:

1. Criar uma branch de desenvolvimento:
```sh
git checkout -b desenvolvimento
git push origin desenvolvimento
```

2. Criar uma branch específica para uma nova funcionalidade:
```sh
git checkout -b feature-nova-tela
git push origin feature-nova-tela
```

3. Enviar alterações para o repositório remoto:
```sh
git add .
git commit -m "Mensagem do commit"
git push origin feature-nova-tela
```

---

### 7️⃣ Testando a Integração
- ✅ Rodar o backend (`Spring Boot`)
- ✅ Rodar o frontend (`React`)
- ✅ Acessar a API (`http://localhost:8080`)
- ✅ Acessar o frontend (`http://localhost:3000`)
- ✅ Verificar se o banco de dados foi criado corretamente

Se tudo estiver funcionando, o ambiente está pronto para desenvolvimento! 🚀

---

## 📌 Organização do Trello
Usamos o Trello para gerenciar tarefas, com as seguintes listas:

1. **Backlog** – Tarefas que precisam ser feitas  
2. **Em Progresso** – Tarefas sendo executadas no momento  
3. **Revisão** – Tarefas concluídas aguardando validação  
4. **Concluído** – Tarefas finalizadas e aprovadas  

---

## 🔥 Próximos Passos
✅ Implementar as primeiras funcionalidades  
✅ Acompanhar o progresso no Trello  
✅ Resolver dúvidas e ajustar configurações conforme necessário  

---

Feito com dedicação pela equipe! 👨‍💻👩‍💻  
