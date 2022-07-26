package com.bootcampexcercise.module3.activity;

public class CalculatorClient {
    public static void main(String[] args) {

        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

        // Add
        int result = normalCalc.add(12, 5);
        System.out.println("1) Add result is " + "" + result);


        // Multiply
        int[] mul = {2, 3, 4};
        result = normalCalc.multiply(mul);

        System.out.println("2) Multiplication result is " + "" + result);


        //Division

        result = normalCalc.divide(10, 2);
        System.out.println("3) Division result is " + "" + result);


        //Subtraction
        result = normalCalc.subtract(10, 2);
        System.out.println("4) Subtract result is " + result);

    }
}