package org.netchat.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private String chatId;
    private List<Message> messages;

    // Constructor
    public Chat(String chatId) {
        this.chatId = chatId;
        this.messages = new ArrayList<>();
    }

    // Getters y Setters
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    // Método para añadir mensajes
    public void addMessage(Message message) {
        this.messages.add(message);
    }
}
