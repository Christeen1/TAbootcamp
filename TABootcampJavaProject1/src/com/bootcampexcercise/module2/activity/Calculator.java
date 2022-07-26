package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String[] args) {

        int i = 10;
        int p = 5;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition - " + add(i, p));
        System.out.println("Subtraction - " + subtract(i, p));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(i, p));

    }

    private static int add(int i, int p) {
        int sum = i + p;
        return sum;
    }

    private static int subtract(int i, int p) {
        int diff = i - p;
        return diff;
    }

    private static int multiply(int[] numbers) {
        int temp = 1;
        for (int k = 0; k < numbers.length; k++) {
            temp = temp * numbers[k];
        }
        return temp;
}

    private static int divide(int i, int p) {
        int divValue = 0;
        if (i == 0 && p == 0) {
            System.out.print("dividing 0 with 0 is not possible");
        } else if (p == 0) {
            System.out.print("division by 0 is not possible");

        } else {
            return i/p;
        }
        return divValue;
    }}