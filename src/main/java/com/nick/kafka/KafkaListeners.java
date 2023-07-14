package com.nick.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "chatting",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received : " + data);
    }
}
