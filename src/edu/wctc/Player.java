package edu.wctc;

/**
 * Contains all the methods and fields necessary to create a player.
 */

public class Player
{
    private String name;
    private int power;
    private int health = 70;
    private WeaponStrategy weaponStrategy;

    public Player(String name, WeaponStrategy weaponStrategy)
    {
        this.name = name;
        this.weaponStrategy = weaponStrategy;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int generateAttack()
    {
        power = 10 + 5;
        return power;
    }

    public WeaponStrategy getWeaponStrategy() {
        return weaponStrategy;
    }

}
