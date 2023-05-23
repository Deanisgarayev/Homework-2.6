package com.skypro.homework26;

import com.skypro.homework26.exception.EmployeeAlreadyAddedException;
import com.skypro.homework26.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
public class EmployeeInterfaceImpl implements EmployeeInterface {
    private final List<Employee> employeeList;

    public EmployeeInterfaceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override

    public Employee add(String firstname, String surname) {
        Employee employee = new Employee(firstname, surname);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstname, String surname) {
        Employee employee = new Employee(firstname, surname);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstname, String surname) {
        Employee employee = new Employee(firstname, surname);
        if (employeeList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableList(employeeList);
    }
}