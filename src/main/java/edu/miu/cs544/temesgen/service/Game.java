package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: BeanInitializationXmlConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Game {
    private Vehicle vehicle;

    public Game(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void play() {
        vehicle.move();
    }
}
