package com.bootcampexcercise.module5.activity;

public class Employee_I extends Person_I {

    //Attributes
    private double salary;
    private String title;


    //Behavior

    //TODO: write default constructor. Print 'I'm an Employee_I Constructor'
    public Employee_I() {
        System.out.println("I'm an Employee_I constructor");
    }

    //TODO: write getter for int salary
    public double getSalary() {
        return salary;
    }

    //TODO: write setter for int salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO: write getter for String title
    public String getTitle() {
        return title;
    }

    //TODO: write setter for String title
    public void setTitle(String Title) {
        this.title = title;
    }
}

