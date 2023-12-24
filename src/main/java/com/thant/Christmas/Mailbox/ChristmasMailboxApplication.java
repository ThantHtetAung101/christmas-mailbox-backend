package com.thant.Christmas.Mailbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ChristmasMailboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChristmasMailboxApplication.class, args);
	}

}
