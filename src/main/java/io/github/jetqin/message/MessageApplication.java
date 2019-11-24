package io.github.jetqin.message;

import io.github.jetqin.message.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class MessageApplication implements CommandLineRunner {

    @Autowired
    KafkaProducer producer;

    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int index = 0; index < 10000; index++) {
//            producer.sendMessage("This is user:"+ String.format("%06d",index));
        }
    }
}
