# Real-Time Chat Application
(Microservice)
A simple, elegant real-time chat application built with Spring Boot and WebSocket.

<img width="1450" height="967" alt="image" src="https://github.com/user-attachments/assets/de5bd379-001a-4c77-ac7b-7d64d04f32ed" />

## Features

- 🚀 Real-time messaging using WebSocket
- 👤 User identification system
- 🔄 Automatic reconnection on connection loss
- 💬 Clean and responsive UI using Bootstrap
- ✨ Real-time connection status indicator
- ⌨️ Enter key support for sending messages

## Technologies Used

- **Backend:**
  - Spring Boot 3
  - Spring WebSocket
  - STOMP Protocol
  - SockJS

- **Frontend:**
  - HTML5
  - Bootstrap 5
  - JavaScript
  - SockJS Client
  - STOMP.js

## Getting Started

### Prerequisites

- JDK 17 or higher
- Gradle

### Running the Application

1. Clone the repository:
```bash
git clone https://github.com/Monudhakad1/RealTimeChatApplication/
```

2. Navigate to the project directory:
```bash
cd RealTimeChatApplication
```

3. Run the application using Gradle:
```bash
./gradlew bootRun
```

4. Access the application:
Open your browser and visit `http://localhost:8080/chat`

## How to Use

1. Enter your name in the top input field
2. Type your message in the bottom input field
3. Click "Send" or press Enter to send your message
4. Messages will appear in real-time for all connected users

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/chatrealtimeindia/realtimechatapplication/
│   │       ├── config/
│   │       │   └── WebSocketConfig.java
│   │       ├── controller/
│   │       │   └── ChatController.java
│   │       ├── model/
│   │       │   └── ChatMessage.java
│   │       └── RealTimeChatApplication.java
│   └── resources/
│       ├── static/
│       └── templates/
│           └── chat.html
```

## Configuration

The WebSocket is configured to:
- Use the `/chat` endpoint for WebSocket connections
- Enable STOMP messaging
- Configure message broker prefixes:
  - `/app` for application destinations
  - `/topic` for subscription topics

## Contributing

Feel free to fork the project and submit pull requests for any improvements you make.
