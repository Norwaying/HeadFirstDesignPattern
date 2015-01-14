package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public abstract class RolePlay {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void performWeapon(){
        weaponBehavior.useWeapon();
    }

}
