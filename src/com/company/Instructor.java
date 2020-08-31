package com.company;

public class Instructor extends Employee {

    public Instructor(){}

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public Instructor(int hours, int salary) {
        super(hours, salary);
    }

    @Override
    public int getSalary(){
        return super.getSalary()*super.getHours();
    }
}
