package com.company;

import java.util.Random;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
public class EmployeeHour extends Employee {
    Random random = new Random();
    int hourlyPayment = random.nextInt(10);
    int salary = hourlyPayment * 8 * 20;

    public EmployeeHour(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public void salary() {
        System.out.println(salary + " $");
    }
}
