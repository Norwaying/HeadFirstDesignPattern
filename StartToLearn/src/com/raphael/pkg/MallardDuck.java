package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I am a Mallard Duck");
    }
}
