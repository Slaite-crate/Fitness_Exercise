package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    private ArrayList<Person> people;
    private ArrayList<Member> members;
    private ArrayList<Employee> employees;

    public FileHandling() {
        people = new ArrayList<>();
        members = new ArrayList<>();
        employees = new ArrayList<>();
        readPeople();
        readMembers();
        readEmployees();
    }

    private void readPeople() {
        try {
            File file = new File("src/com/company/people.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String name = sc.next();
                String cpr = sc.next();
                people.add(new Person(name, cpr));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Person> readPeopleList() {
        return people;
    }

    private void readMembers() {
        try {
            File file = new File("src/com/company/members.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String name = sc.next();
                String cpr = sc.next();
                boolean membership = false;
                if (sc.next().equals("Basic")) {
                    membership = true;
                }
                members.add(new Member(name, cpr, membership));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Member> readMembersList() {
        return members;
    }

    private void readEmployees() {
        try {
            File file = new File("src/com/company/employees.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String name = sc.next();
                String cpr = sc.next();
                int hours = sc.nextInt();
                int salary = sc.nextInt();
                if (sc.hasNextInt()) {
                    int vacation = sc.nextInt();
                    employees.add(new Administration(name, cpr, hours, salary, vacation));
                } else {
                    employees.add(new Instructor(name, cpr, hours, salary));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> readEmployeesList() {
        return employees;
    }
}
