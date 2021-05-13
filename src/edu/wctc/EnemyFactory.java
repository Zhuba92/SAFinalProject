package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates a random enemy when called. Easy to add new enemies
 */

public class EnemyFactory
{
    public Enemy MakeEnemy()
    {
        List<Enemy> enemyList = new ArrayList<>();

        enemyList.add(new Goblin());
        enemyList.add(new Specter());
        enemyList.add(new Bat());

        Random rand = new Random();
        int randEnemy = rand.nextInt(enemyList.size());

        return enemyList.get(randEnemy);
    }

}
