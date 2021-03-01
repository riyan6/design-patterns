package org.pinocchio.study.builder.builders;

import org.pinocchio.study.builder.cars.Car;
import org.pinocchio.study.builder.cars.CarType;
import org.pinocchio.study.builder.components.Engine;
import org.pinocchio.study.builder.components.GpsNavigator;
import org.pinocchio.study.builder.components.Transmission;
import org.pinocchio.study.builder.components.TripComputer;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 汽车构造器
 */
public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;


    @Override
    public void carType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void seats(int seats) {
        this.seats = seats;
    }

    @Override
    public void engine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void transmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void tripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void gpsNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
