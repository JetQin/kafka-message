package io.github.jetqin.message.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {


    @KafkaListener(topics = "test", groupId = "${spring.kafka.consumer.group-id}")
    public void processMessageAtLeastOnce(String message) throws InterruptedException {
        log.info("Consumer message=[" + message + "]");
        Thread.sleep(20);
    }

//    @KafkaListener(topics = "test", groupId = "${spring.kafka.consumer.group-id}")
//    public void processMessageAtMostOnce(String message) {
//        System.out.println("************************At Most Once**********************************");
//        System.out.println("Consumer message=[" + message + "]");
//        System.out.println("************************At Most Once**********************************");
//    }

//    @KafkaListener(topics = "test", groupId = "${spring.kafka.consumer.group-id}")
//    public void processMessageAtExactlyOnce(String message) {
//        System.out.println("************************Exactly Once*************************************");
//        System.out.println("Consumer message=[" + message + "]");
//        System.out.println("************************Exactly Once*************************************");
//    }
}
