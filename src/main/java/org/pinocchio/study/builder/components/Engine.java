package org.pinocchio.study.builder.components;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 产品特征1；发动机
 */
public class Engine {

    private final double volume;

    private double mileage;

    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void go(double mileage) {
        if (this.started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getMileage() {
        return this.mileage;
    }

    public double getVolume() {
        return this.volume;
    }
}
