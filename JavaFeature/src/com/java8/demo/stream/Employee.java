package com.java8.demo.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    double salary;
    String dept;

    Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rajesh", 50000, "ADM"));
        employees.add(new Employee("Pankaj", 60000, "Testing"));
        employees.add(new Employee("Ramesh", 80000, "Testing"));
        employees.add(new Employee("Rahul", 500000, "IT-Support"));
        employees.add(new Employee("Ritesh", 55660, "Admin"));
        employees.add(new Employee("Rajesh", 33300, "ADM"));
        employees.add(new Employee("Rajesh", 4333, "Admin"));
        employees.add(new Employee("Rajesh", 330987, "IT-Support"));
        employees.add(new Employee("Rajesh", 87766, "Admin"));
        employees.add(new Employee("Rajesh", 878787, "ADM"));
        employees.add(new Employee("Rajesh", 98989, "Admin"));
        employees.add(new Employee("Rajesh", 50000, "Testing"));
        return employees;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
