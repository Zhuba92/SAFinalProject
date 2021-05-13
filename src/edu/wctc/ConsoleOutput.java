package edu.wctc;

/**
 * Uses the console to output certain messages
 */

public class ConsoleOutput implements OutputStrategy
{
    @Override
    public void writln(String string)
    {
        System.out.print(string);
    }
}
