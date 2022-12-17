package com.java8.demo.optional;

import java.util.Optional;

public class Employee {
    String name;
    int id;
    double salary;
    Optional<Passport> passport = Optional.empty(); // The container is initially empty

    public Employee(String name, int id, double salary, Optional<Passport> passport) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.passport = passport;
    }

    public Optional<Passport> getPassport() {
        return passport;
    }

    public void setPassport(Optional<Passport> passport) {
        this.passport = passport;
    }

}
