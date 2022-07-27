package com.bootcampexcercise.module5.activity;

public abstract class Shape {

    public String color;
    public double radius;
    public double height;
    public double width;
    public Shape(){

    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void setColour(String c) {
        color = c;
    }

    public String getColour() {
        return color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setCalculateArea(double calculateArea){

    }
}