package com.skypro.homework26;

public class EmployeeController {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Lapshin Alexander Nikolaevich", 1, 5000);
        employees[1] = new Employee("Kurdyum Alexey Anatolyevich", 2, 3000);
        employees[2] = new Employee("Gaziev Zhaudat Yaukhatovichh", 3, 4000);
        employees[3] = new Employee("Shestakov Daniil Zakharovich", 2, 3500);
        employees[4] = new Employee("Morozov Dmitry Yaroslavovich", 1, 4500);

        printEmployees();
        calculateTotalExpense(employees);
        findEmployeeWithMinSalary(employees);
        findEmployeeWithMaxSalary(employees);
        calculateMiddleExpense(employees);
        printEmployeesNames();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void calculateTotalExpense(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        System.out.println("Сумма трат на зарплаты составила =  " + sum);
    }

    public static void findEmployeeWithMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee resultedEmployee = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                resultedEmployee = employee;
            }
        }
        System.out.println(resultedEmployee);
    }

    public static void findEmployeeWithMaxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        Employee resultedEmployee = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                resultedEmployee = employee;
            }
        }
        System.out.println(resultedEmployee);
    }

    public static void calculateMiddleExpense(Employee[] employees) {
        int middleSum = 0;
        int sum = 0;
        int day = 30;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            middleSum = sum / day;

        }
        System.out.println("Сумма трат на зарплаты составила =  " + middleSum);
    }

    public static void printEmployeesNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
}
