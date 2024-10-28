package org.netchat.service;

import org.netchat.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private final List<Message> messages = new ArrayList<>();

    public void saveMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessageHistory() {
        return new ArrayList<>(messages); // Retorna una copia de la lista de mensajes
    }
}
