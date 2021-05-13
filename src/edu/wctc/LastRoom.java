package edu.wctc;

/**
 * inherits everything from Room. the method below is the only one that needs to be overridden.
 */

public class LastRoom extends Room
{
    @Override
    public String GetDescription()
    {
        return "perhaps the most dimly lit and scariest room of all...";
    }
}
