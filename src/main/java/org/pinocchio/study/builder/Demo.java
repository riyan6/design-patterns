package org.pinocchio.study.builder;

import org.pinocchio.study.builder.builders.CarBuilder;
import org.pinocchio.study.builder.builders.CarManualBuilder;
import org.pinocchio.study.builder.cars.Car;
import org.pinocchio.study.builder.cars.Manual;
import org.pinocchio.study.builder.director.Director;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 客户端代码
 */
public class Demo {

    public static void main(String[] args) {
        // Director从客户端获取具体的生成器对象
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car build :\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
