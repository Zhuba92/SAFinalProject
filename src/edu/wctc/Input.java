package edu.wctc;

import java.util.Scanner;

/**
 * Input strategy for getting user input from the console.
 */

public class Input implements InputStrategy
{
    @Override
    public String readln()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}

