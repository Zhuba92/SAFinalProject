package edu.wctc;

/**
 * inherits everything from Room. the method below is the only one that needs to be overridden.
 */

public class FirstRoom extends Room
{
    @Override
    public String GetDescription()
    {
        return "a dimly lit strange room...";
    }
}
