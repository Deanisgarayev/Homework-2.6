package com.skypro.homework26;

import java.util.Collection;
import java.util.Objects;

public interface EmployeeInterface {
   Employee add(String firstname, String surname);

   Employee remove(String firstname, String surname);

   Employee find(String firstname, String surname);

   Collection<Employee>  findAll();
}