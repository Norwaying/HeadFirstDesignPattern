package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public class King extends RolePlay {
    public King(){
        weaponBehavior = new SwordBehavior();
    }
    public void fight(){
        System.out.println("the king is fighting");
            }
}
