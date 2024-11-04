package org.netchat.controller;

import org.springframework.web.bind.annotation.*;

/**
 * ChatController manages chat-related endpoints, allowing users to send and retrieve messages.
 */
@RestController
@RequestMapping("/api/messages")
public class ChatController {

    @GetMapping
    public String getMessages() {
        // Implementación para obtener mensajes
        return "List of messages";
    }

    @PostMapping
    public String sendMessage(@RequestBody String messageContent) {
        // Implementación para enviar un mensaje
        return "Message sent successfully";
    }
}
