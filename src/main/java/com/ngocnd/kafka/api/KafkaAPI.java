package com.ngocnd.kafka.api;

import com.ngocnd.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaAPI {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/pub")
    public void publishingMessage() {
        kafkaService.sendMessage("ngocnd", "Message 1");
    }

    @GetMapping("/pub-many-message/{n}")
    public void publishingMessage(@PathVariable int n) {
        kafkaService.sendManyMessage("ngocnd", n);
    }

}
