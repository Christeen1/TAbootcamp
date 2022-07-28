package com.bootcampexcercise.module7.activity;

public class CustomExceptionActivityTest {

    public static void main(String[] args)throws CustomExceptionActivity{
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        obj.validateUser("Shanti");
        obj.validateUser("Jim");
    }

    void validateUser(String name) throws CustomExceptionActivity {

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i] == name) {
                flag = 1;
            }}

        if (flag == 0) {
            throw new CustomExceptionActivity();}
    else {
    System.out.println("Welcome to Payroll program, "+name);
    }}}