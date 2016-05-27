package com.company;


public class Main {

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new EmployeeFixed(1, "Mustafa", "Asanaliev", 1000);
        employee[1] = new EmployeeHour(2, "Muhtar", "Dulakbaev", 567);
        employee[2] = new EmployeeFixed(3, "Tamir", "Almazaev", 1000);
        employee[3] = new EmployeeHour(4, "Dastan", "Kaldybaev", 365);
        employee[4] = new EmployeeHour(5, "Umit", "Yildyz", 1320);
        employee[5] = new EmployeeFixed(6, "Aslan", "Berabekov", 1000);
        employee[6] = new EmployeeFixed(7, "Ali", "Bey", 1000);
        employee[7] = new EmployeeHour(8, "Erkan", "Yalabyk",1028);
        employee[8] = new EmployeeHour(9, "Aran", "Ozamegov", 237);
        employee[9] = new EmployeeFixed(10, "Mahmud", "Uzaraev", 1000);


        System.out.println("Заработная плата работников: ");
        System.out.printf("%2s %10s %14s %15s", "ID", "NAME", "SURNAME", "SALARY");
        System.out.println();
        System.out.println();
        for (int i = 0; i < employee.length; i++) {
            System.out.printf("%2s %12s %10s %18s",
                    employee[i].getId(), employee[i].getName(),
                    employee[i].getSurname(), employee[i].salary());
            System.out.println();
        }
    }
}

