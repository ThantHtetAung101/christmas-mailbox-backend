package com.thant.Christmas.Mailbox.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "question", columnDefinition = "TEXT")
    private String question;
    @Column(name = "answer", columnDefinition = "TEXT")
    private String answer;
    @CreatedDate
    @Column(name = "created_date")
    private Date created_at;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
