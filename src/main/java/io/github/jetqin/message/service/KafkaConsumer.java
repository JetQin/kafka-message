package io.github.jetqin.message.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


//    @KafkaListener(topics = "test", groupId = "${spring.kafka.consumer.group-id}")
//    public void processMessage(String message) {
//        System.out.println("************************************************************************");
//        System.out.println("Consumer message=[" + message + "]");
//        System.out.println("************************************************************************");
//    }


    @KafkaListener(topics = "test", groupId = "${spring.kafka.consumer.group-id}")
    public void processMessageAtLeastOnce(String message) throws InterruptedException {
        System.out.println("*************************At Least Once**********************************");
        System.out.println("Consumer message=[" + message + "]");
        System.out.println("*************************At Least Once**********************************");
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
