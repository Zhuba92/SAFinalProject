package edu.wctc;

/**
 * One of 3 potential weapon choices that can be assigned by the WeaponFactory
 */

public class Sword implements WeaponStrategy
{
    @Override
    public String UseWeapon(Player player)
    {
        player.setPower(10);
        return "slashed the enemy with the sword!";
    }
}
