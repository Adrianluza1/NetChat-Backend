package org.netchat.controller;

import org.netchat.model.ChatMessage;
import org.netchat.model.Message;
import org.netchat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final ChatService chatService;

    @Autowired
    public MessageController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public List<ChatMessage> getMessageHistory() {
        return chatService.getMessageHistory();
    }

    @PostMapping
    public Message saveMessage(@RequestBody Message message) {
        return chatService.saveMessage(message);
    }
}
