package com.company;

public class Main {

    public static void main(String[] args) {
        FileHandling FH = new FileHandling();
        for (Person ps : FH.readList()){
            System.out.printf("%-10s", ps.getName());
            System.out.printf("%10s",ps.getCpr());
            System.out.println();
        }
        for (Person ps : FH.readList()){
            System.out.println(ps);
        }
    }
}
