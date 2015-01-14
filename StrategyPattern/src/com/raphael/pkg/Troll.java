package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public class Troll extends RolePlay {
    public Troll(){
        weaponBehavior = new KnifeBehavior();
    }
    public void fight(){
        System.out.println("the troll is fighting");
    }
}
