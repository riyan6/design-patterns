package org.pinocchio.study.builder.builders;

import org.pinocchio.study.builder.cars.CarType;
import org.pinocchio.study.builder.components.Engine;
import org.pinocchio.study.builder.components.GpsNavigator;
import org.pinocchio.study.builder.components.Transmission;
import org.pinocchio.study.builder.components.TripComputer;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 构建者模式 / 生成器模式
 */
public interface Builder {

    void carType(CarType carType);

    void seats(int seats);

    void engine(Engine engine);

    void transmission(Transmission transmission);

    void tripComputer(TripComputer tripComputer);

    void gpsNavigator(GpsNavigator gpsNavigator);

}
