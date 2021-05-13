package edu.wctc;

/**
 * inherits everything from Room. the method below is the only one that needs to be overridden.
 */

public class SecondRoom extends Room
{
    @Override
    public String GetDescription()
    {
        return "an even more dimly lit and scary room...";
    }
}
