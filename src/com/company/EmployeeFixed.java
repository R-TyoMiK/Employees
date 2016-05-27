package com.company;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
public class EmployeeFixed extends Employee {
    int salary = 1000;

    private EmployeeFixed(int id, String name, String surname, int salary) {
        super(id, name, surname, salary);
    }


    @Override
    public int salary() {
        System.out.println(salary + " $");
        return salary;
    }
}

