# Projeto Chat em Tempo Real com Java + STOMP

Este é um projeto de chat em tempo real utilizando Spring Boot e 
WebSocket que gerencia conexões e realiza a transmissão de 
mensagens entre usuários conectados.

### 💻 Tecnologias Utilizadas

- Java
- Spring Boot
- WebSocket 
- STOMP Protocol

## 🚀 Vamos começar

### Pré-requisitos
Certifique-se de ter instalado:
- [JDK 21](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Maven](https://maven.apache.org/download.cgi)

### Como rodar o projeto
1. Clone o repositório:
```
git clone https://github.com/kauahaymon/live-chat-backend.git
```
2. Instale as dependências e execute o projeto:
```
mvn clean install
mvn spring-boot:run
```
3. Acesse o projeto localmente no navegador: http://localhost/8080

### 📡 Endpoints da API

- **`/endpoint-livechat-websocket`**: Conexão WebSocket.
- **`/app/new-message`**: Recebe mensagens dos clientes.
- **`/topics/livechat`**: Transmite mensagens para os clientes.

### ⏭️ Próximos passos
- Adicionar um Front-end simples para interagir com a API.
