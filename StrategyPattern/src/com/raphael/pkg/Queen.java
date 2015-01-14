package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public class Queen extends RolePlay {
    public Queen(){
        weaponBehavior = new AxeBehavior();
    }
    public void fight(){
        System.out.println("the queen is fighting");
    }
}
