package edu.wctc;

/**
 * Generates a weapon at runtime based on what the user inputs.
 */

public class WeaponFactory
{
    public WeaponStrategy MakeWeapon(int choice)
    {
        WeaponStrategy weapon = null;

        if(choice == 1)
        {
            return new Sword();
        }
        else if(choice == 2)
        {
            return new Staff();
        }
        else
        {
            return new Hands();
        }
    }
}
