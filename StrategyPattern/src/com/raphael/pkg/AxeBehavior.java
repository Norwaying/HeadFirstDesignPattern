package com.raphael.pkg;

import com.raphael.pkg.WeaponBehavior;

/**
 * Created by Nov on 2015/1/14.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use the axe");
    }
}
