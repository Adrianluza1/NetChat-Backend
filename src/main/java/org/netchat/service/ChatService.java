package org.netchat.service;

import org.netchat.model.Message;
import org.netchat.model.User;
import org.netchat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ChatService provides business logic for chat operations,
 * such as sending and retrieving messages between users.
 */
@Service
public class ChatService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesBetweenUsers(User sender, User receiver) {
        return messageRepository.findBySenderAndReceiver(sender, receiver);
    }

    public List<Message> getMessagesForUser(User receiver) {
        return messageRepository.findByReceiver(receiver);
    }

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }
}
