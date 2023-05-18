package com.skypro.homework26;

public class Employee {
    public class Employee {
        private String fullName;
        private int department;
        private int salary;
        private int id;
        private static int counter = 1;


        public Employee(String fullName, int department, int salary) {
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            this.id = counter++;

        }

        public String getFullName() {
            return this.fullName;
        }

        public int getSalary() {
            return this.salary;
        }

        public int getDepartment() {
            return this.department;
        }

        public int getId() {
            return this.id;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Имя " + fullName + " Отдел " + department + " Зарплата " + salary;
        }
    }
}
