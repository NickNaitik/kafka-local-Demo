package com.nick.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/chat")
public class ChatController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public ChatController(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping
    public void publish(@RequestBody ChatRequest chatRequest){
        kafkaTemplate.send("chatting", chatRequest.message());
    }
}
