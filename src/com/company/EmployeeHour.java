package com.company;

import java.util.Random;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
public class EmployeeHour extends Employee {
    Random random = new Random();
    private int hourlyPayment = random.nextInt(10);
    private int salary = hourlyPayment * 8 * 20;




    public EmployeeHour(int id, String name, String surname, int salary) {
        super(id, name, surname);
        this.salary = salary;

    }


    @Override
    public int salary() {
        return salary;
    }
}
