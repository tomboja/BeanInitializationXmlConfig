package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.service.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: BeanInitializationXmlConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        Game game = springContext.getBean(Game.class);

        game.play();

        System.out.println("End....");
    }
}
