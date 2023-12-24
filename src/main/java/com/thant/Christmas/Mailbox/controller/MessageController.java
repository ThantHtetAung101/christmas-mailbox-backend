package com.thant.Christmas.Mailbox.controller;

import com.thant.Christmas.Mailbox.entity.Message;
import com.thant.Christmas.Mailbox.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageService service;

    @PostMapping("/send-message")
    public Message sendMessage(@RequestBody Message message) {
        return service.sendMessage(message);
    }

    @PostMapping("/answer/{id}")
    public Message answerMessage(@RequestBody Message message,@PathVariable int id) {
        return service.answerMessage(id, message);
    }

    @GetMapping("/unanswered-question")
    public Optional<Message> getUnansweredQuestion() {
        return service.getUnansweredQuestion();
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return  service.getAllMessages();
    }

    @GetMapping("/messages/{id}")
    public Message getMessageById(@PathVariable int id) {
        return service.getMessageById(id);
    }
}
