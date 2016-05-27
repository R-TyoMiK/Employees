package com.company;


public class Main {

    public static void main(String[] args) {

        EmployeeHour[] employeeHour = new EmployeeHour[5];
        employeeHour[0] = new EmployeeHour(1, "Mustafa", "Asanaliev");
        employeeHour[1] = new EmployeeHour(2, "Muhtar", "Dulakbaev");
        employeeHour[2] = new EmployeeHour(3, "Tamir", "Almazaev");
        employeeHour[3] = new EmployeeHour(4, "Dastan", "Kaldybaev");
        employeeHour[4] = new EmployeeHour(5, "Umit", "Yildyz");


        EmployeeFixed[] employeeFixed = new EmployeeFixed[5];
        employeeFixed[0] = new EmployeeFixed(1, "Aslan", "Berabekov");
        employeeFixed[1] = new EmployeeFixed(2, "Ali", "Bey");
        employeeFixed[2] = new EmployeeFixed(3, "Erkan", "Yalabyk");
        employeeFixed[3] = new EmployeeFixed(4, "Aran", "Ozamegov");
        employeeFixed[4] = new EmployeeFixed(5, "Mahmud", "Uzaraev");


        System.out.println("Заработная плата работников с почасовой ставкой: ");
        System.out.printf("%2s %10s %14s %15s", "ID", "NAME", "SURNAME", "SALARY");
        System.out.println();
        System.out.println();
        for (int i = 0; i < employeeHour.length; i++) {
            System.out.printf("%2s %12s %10s %18s",
                    employeeHour[i].getId(), employeeHour[i].getName(),
                    employeeHour[i].getSurname(), employeeHour[i].salary);
            System.out.println();
        }
        System.out.println();

        System.out.println("Заработная плата работников с фиксированной ставкой: ");
        System.out.printf("%2s %10s %14s %15s", "ID", "NAME", "SURNAME", "SALARY");
        System.out.println();
        System.out.println();
        for (int i = 0; i < employeeFixed.length; i++) {
            System.out.printf("%2s %12s %10s %18s", employeeFixed[i].getId(), employeeFixed[i].getName(),
                    employeeFixed[i].getSurname(), employeeFixed[i].salary);
            System.out.println();
        }


    }
}

