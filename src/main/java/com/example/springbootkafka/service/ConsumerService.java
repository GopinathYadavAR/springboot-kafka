package com.example.springbootkafka.service;

import com.example.springbootkafka.model.Employee;

import java.util.List;

public interface ConsumerService {

    void read(Employee employee);

    List<Employee> getEmployees();
}
