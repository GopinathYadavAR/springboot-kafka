package com.example.springbootkafka.service.impl;

import com.example.springbootkafka.model.Employee;
import com.example.springbootkafka.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    Logger log = LoggerFactory.getLogger(ConsumerServiceImpl.class);

    List<Employee> employees = new ArrayList<>();

    @KafkaListener(topics = "${app.spring.kafka.topic}",groupId = "${app.spring.kafka.groupid}")
    @Override
    public void read(Employee employee) {

        employees.add(employee);
    }

    @Override
    public List<Employee> getEmployees() {

        return employees;
    }
}
