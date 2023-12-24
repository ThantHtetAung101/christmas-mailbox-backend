package com.thant.Christmas.Mailbox.service;

import com.thant.Christmas.Mailbox.entity.Message;
import com.thant.Christmas.Mailbox.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public Message sendMessage(Message message) {
        Message msg = new Message();
        msg.setQuestion(message.getQuestion());
        return repository.save(msg);
    }

    public Message answerMessage(int id, Message message) {
        Message msg = repository.findById(id).orElse(null);
        System.out.println(msg);
        msg.setAnswer(message.getAnswer());
        return repository.save(msg);
    }

    public Optional<Message> getUnansweredQuestion() {
        return repository.findTopByAnswerIsNull();
    }

    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    public Message getMessageById(int id) {
        return repository.findById(id).orElse(null);
    }
}
