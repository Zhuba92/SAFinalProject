package edu.wctc;

/**
 * The strategy from which all output classes will inherit.
 */

public interface OutputStrategy
{
    void writln(String string);
}
