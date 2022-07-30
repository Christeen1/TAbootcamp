package com.bootcampexcercise.module10;

public class InterfaceActivityClass {

    public static void main(String arg[]){
        Vehicle bike = new Bike();
                Vehicle car = new Car();

                bike.vehicleStart();
                bike.vehicleStop();
                car.vehicleStart();
                car.vehicleStop();
    }
}
