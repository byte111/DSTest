package com.ds;

/**
 * Created by dbhattac on 2/28/2017.
 */
public class FinalRef {
    FinalRef()
    {
        System.out.println("Default");
    }

    FinalRef(final FinalRef f)
    {
        System.out.println("final");
    }

    public static void main(String args[])
    {
        FinalRef a = new FinalRef();
        FinalRef b = a;
        FinalRef c = new FinalRef(b);

    }
}
