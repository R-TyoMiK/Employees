package com.company;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
public abstract class Employee {
    public String name;
    public String surname;
    public int id;

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getId() {
        return id;
    }


    public abstract void salary();
}
