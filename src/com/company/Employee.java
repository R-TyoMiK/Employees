package com.company;

/**
 * Created by R-TyoMiK on 26.05.2016.
 */
abstract class Employee {
    private String name;
    private String surname;
    private int id;


    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public abstract int salary();
}
