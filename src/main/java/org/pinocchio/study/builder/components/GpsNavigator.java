package org.pinocchio.study.builder.components;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: 产品特征2；gps导航系统
 */
public class GpsNavigator {

    private String route;

    public GpsNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GpsNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
