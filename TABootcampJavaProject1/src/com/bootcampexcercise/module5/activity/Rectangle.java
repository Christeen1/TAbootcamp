package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {
    public double calculateArea()
        {
            return this.height * this.width;
     }
        public double calculatePerimeter(){
          return ((this.height + this.width)*2);
   }

}