package com.bootcampexcercise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {

        int[] numbers = {98, 3, 1, 12, 11,26};
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result)
                result = numbers[i];
            }
        System.out.println("Largest in array is "+result);


    }
}
