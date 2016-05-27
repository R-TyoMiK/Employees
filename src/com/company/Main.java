package com.company;


public class Main {

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(1, "Mustafa", "Asanaliev");
        employee[1] = new Employee(2, "Muhtar", "Dulakbaev");
        employee[2] = new Employee(3, "Tamir", "Almazaev");
        employee[3] = new Employee(4, "Dastan", "Kaldybaev");
        employee[4] = new Employee(5, "Umit", "Yildyz");
        employee[5] = new Employee(6, "Aslan", "Berabekov");
        employee[6] = new Employee(7, "Ali", "Bey");
        employee[7] = new Employee(8, "Erkan", "Yalabyk");
        employee[8] = new Employee(9, "Aran", "Ozamegov");
        employee[9] = new Employee(10, "Mahmud", "Uzaraev");


        System.out.println("Заработная плата работников с почасовой ставкой: ");
        System.out.printf("%2s %10s %14s %15s", "ID", "NAME", "SURNAME", "SALARY");
        System.out.println();
        System.out.println();
        for (int i = 0; i < employee.length; i++) {
            System.out.printf("%2s %12s %10s %18s",
                    employee[i].getId(), employee[i].getName(),
                    employee[i].getSurname(), employee[i].getSalary());
            System.out.println();
        }
    }
}

