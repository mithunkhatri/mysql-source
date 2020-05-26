package com.mithunkhatri.data.mysqlsource.controllers;

import com.mithunkhatri.data.mysqlsource.entities.Department;
import com.mithunkhatri.data.mysqlsource.entities.DepartmentManager;
import com.mithunkhatri.data.mysqlsource.entities.Employee;
import com.mithunkhatri.data.mysqlsource.repositories.DepartmentManagerRepository;
import com.mithunkhatri.data.mysqlsource.repositories.DepartmentRepository;
import com.mithunkhatri.data.mysqlsource.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DepartmentRepository departmentRepository;
    private final DepartmentManagerRepository departmentManagerRepository;
    private final EmployeeRepository employeeRepository;
    private final MessageChannel output;

    @Autowired
    public DataController(DepartmentRepository departmentRepository,
                          DepartmentManagerRepository departmentManagerRepository,
                          EmployeeRepository employeeRepository,
                          MessageChannel output) {
        this.departmentRepository = departmentRepository;
        this.departmentManagerRepository = departmentManagerRepository;
        this.employeeRepository = employeeRepository;
        this.output = output;
    }

    @GetMapping(value = "/departments")
    public void departments() {
        for (Department department : departmentRepository.findAll()) {
            output.send(MessageBuilder.withPayload(department)
                    .setHeader(KafkaHeaders.MESSAGE_KEY, "departments")
                    .build());
        }
    }

    @GetMapping(value = "/departmentManagers")
    public void departmentManagers() {
        for (DepartmentManager department : departmentManagerRepository.findAll()) {
            output.send(MessageBuilder.withPayload(department)
                    .setHeader(KafkaHeaders.MESSAGE_KEY, "departmentManagers")
                    .build());
        }
    }

    @GetMapping(value = "/employees")
    public void employees() {
        for (Employee employee : employeeRepository.findAll()) {
            output.send(MessageBuilder.withPayload(employee)
                    .setHeader(KafkaHeaders.MESSAGE_KEY, "employee")
                    .build());
        }
        System.out.println("finish");
    }
}
