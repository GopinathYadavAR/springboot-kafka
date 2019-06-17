package com.example.springbootkafka.service;

import com.example.springbootkafka.model.Employee;

public interface ProducerService {
    void sendMessage(Employee employee);
}
