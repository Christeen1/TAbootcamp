package com.bootcampexcercise.module9.activity;

public class Person {

    private int weight;
    private float height;

    public Person() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double calculateBmi() {
        return this.weight / (this.weight * this.height);
    }

    public String toStringCalculateBmi() {
        double calculateBmi = this.weight / (this.weight * this.height);
        if (this.weight <= 0 && this.height <= 0) {
            return "Error. Values can't be zero.";
        }
        if (this.weight > 300 || this.weight < 20) {
            return "Error. Impossible weight";
        }
        if (this.height > 251 || this.height < 120) {
            return "Error. Impossible height";
        }
        return "Your BMI is: " + calculateBmi;
    }
}
