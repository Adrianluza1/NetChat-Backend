package org.netchat.service;

import org.netchat.model.ChatMessage;
import org.netchat.model.Message;
import org.netchat.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    private final ChatMessageRepository chatMessageRepository;

    @Autowired
    public ChatService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    // Método para obtener el historial de mensajes
    public List<ChatMessage> getMessageHistory() {
        return chatMessageRepository.findAll();
    }

    // Método para guardar un mensaje
    public ChatMessage saveMessage(ChatMessage message) {
        return chatMessageRepository.save(message);
    }
}
