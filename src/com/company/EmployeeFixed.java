package com.company;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
public class EmployeeFixed extends Employee {
    int salary = 1000;

    public EmployeeFixed(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void salary() {
        System.out.println(salary + " $");
    }
}

