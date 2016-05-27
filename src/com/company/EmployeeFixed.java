package com.company;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
public class EmployeeFixed extends Employee {
    private int salary = 1000;


    public EmployeeFixed(int id, String name, String surname, int salary) {
        super(id, name, surname);
        this.salary = salary;
    }


    @Override
    public int salary() {
        return salary;
    }
}

