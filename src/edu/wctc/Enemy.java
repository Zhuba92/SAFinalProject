package edu.wctc;

/**
 * The abstract class all sub enemies inherit from
 */

public abstract class Enemy
{
    public String Name;
    public int power;
    public int health;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void doAttack()
    {

    }
}
