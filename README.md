# ChatRMI

## Description
ChatRMI is a basic chat application implemented using Java RMI (Remote Method Invocation). It allows multiple clients to send messages to a remote server, which displays them in the console. This project serves as an introduction to distributed computing and remote communication in Java.

## Project Structure
```
📂 ChatRMI/
┣ 📂 src/
┃ ┣ 📂 chat/
┃ ┃ ┣ 📂 model/ 
┃ ┃ ┃ ┣ 📜 ChatServidor.java  # RMI interface for the server
┃ ┃ ┃ ┣ 📜 ChatCliente.java   # RMI interface for the client
┃ ┃ ┣ 📂 service/ 
┃ ┃ ┃ ┣ 📜 ChatServidorImpl.java  # Server implementation
┃ ┃ ┃ ┣ 📜 ChatMainServidor.java  # Main class to start the server
┃ ┃ ┃ ┣ 📜 ChatMainCliente.java  # Main class for the client
```

## Features
- Clients can send messages to a central server.
- The server receives and displays messages in real-time.
- Uses Java RMI for remote communication.

## Installation & Execution
### 1. Compile the project (go to the src folder)
```
javac chat/model/*.java chat/service/*.java
```

### 2. Run the server
```
java chat.service.ChatMainServidor
```

### 3. Run the client
```
java chat.service.ChatMainCliente
```

## Requirements
- Java 8 or higher

### Developed as part of a distributed systems exercise.
