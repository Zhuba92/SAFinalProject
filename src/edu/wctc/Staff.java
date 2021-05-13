package edu.wctc;

/**
 * One of 3 potential weapon choices that can be assigned by the WeaponFactory
 */

public class Staff implements WeaponStrategy
{
    @Override
    public String UseWeapon(Player player)
    {
        player.setPower(10);
        return "hurled a magical orb at the enemy from the staff!";
    }
}
