package edu.wctc;

/**
 * Junit test for an integer returning method in Player
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest
{
    List<Integer> nums = new ArrayList<Integer>();

    @BeforeEach
    void runIt()
    {
        nums.add(1);
        nums.add(9);
    }

    @Test
    void generateAttack()
    {
        assertEquals(nums.get(0), 1);
    }
}