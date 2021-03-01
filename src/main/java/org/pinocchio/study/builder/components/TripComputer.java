package org.pinocchio.study.builder.components;

import org.pinocchio.study.builder.cars.Car;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 产品特征4；里程表
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
