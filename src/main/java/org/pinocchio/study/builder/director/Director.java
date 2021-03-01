package org.pinocchio.study.builder.director;

import org.pinocchio.study.builder.builders.Builder;
import org.pinocchio.study.builder.cars.CarType;
import org.pinocchio.study.builder.components.Engine;
import org.pinocchio.study.builder.components.GpsNavigator;
import org.pinocchio.study.builder.components.Transmission;
import org.pinocchio.study.builder.components.TripComputer;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 主管控制生成器
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.carType(CarType.SPORTS_CAR);
        builder.seats(2);
        builder.engine(new Engine(3.0, 0));
        builder.transmission(Transmission.SEMI_AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GpsNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.carType(CarType.CITY_CAR);
        builder.seats(2);
        builder.engine(new Engine(1.2, 0));
        builder.transmission(Transmission.AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GpsNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.carType(CarType.SUV);
        builder.seats(4);
        builder.engine(new Engine(2.5, 0));
        builder.transmission(Transmission.MANUAL);
        builder.gpsNavigator(new GpsNavigator());
    }

}
