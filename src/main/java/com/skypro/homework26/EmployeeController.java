package com.skypro.homework26;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeInterface employeeInterface;

    public EmployeeController(EmployeeInterface employeeInterface) {
        this.employeeInterface = employeeInterface;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstname, @RequestParam String surname) {
        return employeeInterface.add(firstname, surname);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstname, @RequestParam String surname) {
        return employeeInterface.remove(firstname, surname);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstname, @RequestParam String surname) {
        return employeeInterface.find(firstname, surname);
    }
        @GetMapping
                public Collection<Employee> findAll() {
            return employeeInterface.findAll();
        }
    }
