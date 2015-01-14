package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
        mallard.performQuack();
    }
}
