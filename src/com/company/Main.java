package com.company;

public class Main {

    public static void main(String[] args) {
        FileHandling FH = new FileHandling();
        System.out.printf("%-15s", "Name");
        System.out.println("cpr");
        System.out.println("**************************************");
        for (Person ps : FH.readList()){
            System.out.printf("%-15s", ps.getName());
            System.out.print(ps.getCpr() + "\n");
        }
    }
}
