package com.company;

public class Menu {

    public Menu() {
    }

    public void people() {
        FileHandling FH = new FileHandling();
        System.out.println("EMPLOYEES AND MEMBERS");
        System.out.printf("%-15s", "Name");
        System.out.println("cpr");
        System.out.println("**************************************************************************");
        for (Person ps : FH.readPeopleList()) {
            System.out.printf("%-15s", ps.getName());
            System.out.print(ps.getCpr() + "\n");
        }
        System.out.println("==========================================================================");
        System.out.println();
    }

    public void employees() {
        FileHandling FH = new FileHandling();
        System.out.println("EMPLOYEES");
        System.out.printf("%-15s", "Name");
        System.out.printf("%-15s", "cpr");
        System.out.printf("%-15s", "hours");
        System.out.printf("%-15s", "salary");
        System.out.println("vacation");
        System.out.println("**************************************************************************");
        for (Employee em : FH.readEmployeesList()) {
            System.out.printf("%-15s", em.getName());
            System.out.printf("%-15s", em.getCpr());
            System.out.printf("%-15s", em.getHours());
            System.out.printf("%-15s", em.getSalary());
            if (em instanceof Administration) {
                System.out.printf("%-15s", ((Administration) em).getVacation());
            }
            System.out.println();
        }
        System.out.println("==========================================================================");
        System.out.println();
    }

    public void members() {
        FileHandling FH = new FileHandling();
        System.out.println("MEMBERS");
        System.out.printf("%-15s", "Name");
        System.out.printf("%-15s", "cpr");
        System.out.printf("%-15s", "membership");
        System.out.println("fee");
        System.out.println("**************************************************************************");
        for (Member mem : FH.readMembersList()) {
            System.out.printf("%-15s", mem.getName());
            System.out.printf("%-15s", mem.getCpr());
            System.out.printf("%-15s", mem.getMemberType());
            System.out.printf("%-15s", mem.monthlyFee());
            System.out.println();
        }
        System.out.println("==========================================================================");
        System.out.println();
    }
}
