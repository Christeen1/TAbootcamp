package com.bootcampexcercise.module10;

public abstract class Person {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduceName() {
        System.out.println("My Name is " + getName() + " and I am " + getAge() + " years old ");

    }
}

