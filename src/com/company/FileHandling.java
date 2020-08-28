package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    ArrayList<Person> people;

    public FileHandling(){
        people = new ArrayList<Person>();
        readFile();
    }

    private void readFile(){
        try {
            File file = new File("src/com/company/persons.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String name = sc.next();
                String cpr = sc.next();
                people.add(new Person(name, cpr));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Person> readList(){
        return people;
    }
}
