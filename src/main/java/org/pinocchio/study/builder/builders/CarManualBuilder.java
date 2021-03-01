package org.pinocchio.study.builder.builders;

import org.pinocchio.study.builder.cars.CarType;
import org.pinocchio.study.builder.cars.Manual;
import org.pinocchio.study.builder.components.Engine;
import org.pinocchio.study.builder.components.GpsNavigator;
import org.pinocchio.study.builder.components.Transmission;
import org.pinocchio.study.builder.components.TripComputer;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 汽车手册生成器
 */
public class CarManualBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void carType(CarType carType) {
        this.type = type;
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
