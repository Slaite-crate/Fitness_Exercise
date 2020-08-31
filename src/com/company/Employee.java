package com.company;

public class Employee extends Person {
    private int hours;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String cpr, int hours, int salary) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}
