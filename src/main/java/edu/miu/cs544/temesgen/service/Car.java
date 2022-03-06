package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: BeanInitializationXmlConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Car implements Vehicle{

    @Override
    public void move() {
        System.out.println("Car moves at 50 mph");
    }
}
