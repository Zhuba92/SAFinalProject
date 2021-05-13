package edu.wctc;

import java.util.Locale;
import java.util.Random;

/**
 * This class is the super for all rooms.
 */

public abstract class Room
{
    private EnemyFactory enemyFactory = new EnemyFactory();
    private Enemy enemy = enemyFactory.MakeEnemy();

    public int getEnemyPower()
    {
        return enemy.getPower();
    }

    public String toString()
    {
        return enemy.getName();
    }

    public Enemy getEnemy() { return enemy; }

    public String GetDescription()
    {
        return "";
    }

    /**
     * This is the method that runs all of the battle mechanics and generates attacks for both the players and computer enemy.
     * @param player
     * @param enemy
     * @param room
     */
    public void doBattle(Player player, Enemy enemy, Room room)
    {
        System.out.println("");
        System.out.println(enemy.getName() + " " + "has appeared in " + room.GetDescription());
        System.out.println("");
        InputStrategy input = new Input();
        Random rand = new Random();
        int playerHealth = player.getHealth();
        int enemyHealth = enemy.getHealth();
        player.getWeaponStrategy().UseWeapon(player);
        while(playerHealth > 0 && enemyHealth > 0)
        {
            int attackModifier = rand.nextInt(6);
            System.out.print("Hit (A) to attack! ");
            String attack = input.readln().toUpperCase();
            if(attack.equals("A"))
            {
                System.out.print(player.getName() + " " + player.getWeaponStrategy().UseWeapon(player));
                playerHealth -= getEnemyPower() + attackModifier;
                System.out.print(" For " + (player.getPower() + attackModifier) + " damage!");
                System.out.println(" ");
                player.setHealth(playerHealth);
                enemyHealth -= player.getPower() + attackModifier;
                enemy.setHealth(enemyHealth);
                if(player.getHealth() > 0 && enemy.getHealth() > 0)
                {
                    System.out.println(player.getName() + "'s health: " + player.getHealth());
                    System.out.println(enemy.getName() + "'s health: " + enemy.getHealth());
                    System.out.println(" ");
                }
                else if(player.getHealth() <= 0 && enemy.getHealth() > 0)
                {
                    System.out.println(enemy.getName() + " has won with " + enemy.getHealth() + " health remaining.");
                    System.out.println(player.getName() + " has lost the game, better luck next time!");
                    System.exit(0);
                }
                else if(enemy.getHealth() <= 0 && player.getHealth() > 0)
                {
                    System.out.println(player.getName() + " has beaten " + enemy.getName() + "!");
                    System.out.println("As a reward, your health has been refilled!");
                    System.out.println("");
                    player.setHealth(70);
                }
            }
        }
    }
}
