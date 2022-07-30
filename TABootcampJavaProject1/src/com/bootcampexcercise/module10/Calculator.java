package com.bootcampexcercise.module10;


public class Calculator {

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public int getSubstract(int a, int b) {
        return a - b;
    }

    public double getDivide(double a, double b) {
        try {
            System.out.println(a / 0);
        } catch (Exception x) {
            System.out.println(" ");
        } finally {
            System.out.println("Your result is: ");
        }
        return a/b;
    }


    public double getMultiply(double a, double c, double b){
            if (a<=0 || b<=0 || c<=0) throw new ArithmeticException("Can't be zero");
        else{ System.out.println("The result is: ");
            return a * b * c;}

    }
}




