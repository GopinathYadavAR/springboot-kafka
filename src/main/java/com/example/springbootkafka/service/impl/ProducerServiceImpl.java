package com.example.springbootkafka.service.impl;

import com.example.springbootkafka.model.Employee;
import com.example.springbootkafka.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {
    Logger log = LoggerFactory.getLogger(ProducerServiceImpl.class);
    private final KafkaTemplate<String,Employee> kafkaTemplate;
    @Value("${app.spring.kafka.topic}")
    private String topic;
     @Autowired
    public ProducerServiceImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(Employee employee) {
        log.info("String{}",employee);
        kafkaTemplate.send(topic,employee);

    }
}
