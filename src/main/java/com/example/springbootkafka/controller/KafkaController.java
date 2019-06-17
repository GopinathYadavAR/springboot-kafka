package com.example.springbootkafka.controller;

import com.example.springbootkafka.model.Employee;
import com.example.springbootkafka.service.ConsumerService;
import com.example.springbootkafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private ProducerService producerService;
    private ConsumerService consumerService;

    @Autowired
    public KafkaController(ProducerService producerService,ConsumerService consumerService) {
        this.producerService = producerService;
        this.consumerService =consumerService;
    }
    @PostMapping
    ResponseEntity<HttpStatus> send(@RequestBody Employee employee){
        producerService.sendMessage(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
  @GetMapping
    ResponseEntity<List<Employee>> getEmplyoee(){
        return new ResponseEntity<List<Employee>>(consumerService.getEmployees(),HttpStatus.OK);
    }
}
