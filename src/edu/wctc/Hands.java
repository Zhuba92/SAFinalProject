package edu.wctc;

/**
 * One of 3 potential weapon choices that can be assigned by the WeaponFactory
 */

public class Hands implements WeaponStrategy
{
    @Override
    public String UseWeapon(Player player)
    {
        player.setPower(9);
        return "hit the enemy with a mean right hook!";
    }
}
