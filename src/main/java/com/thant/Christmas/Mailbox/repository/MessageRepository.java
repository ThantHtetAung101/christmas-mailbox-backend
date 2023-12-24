package com.thant.Christmas.Mailbox.repository;

import com.thant.Christmas.Mailbox.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    Optional<Message> findTopByAnswerIsNull();
}
