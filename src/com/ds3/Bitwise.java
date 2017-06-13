package com.ds3;

/**
 * Created by dbhattac on 3/26/2017.
 */
public class Bitwise {

    public static void main(String args[])
    {
        //int val = Long.decode("0xff00ff00").intValue();
        int num = 123;
        System.out.println((num>>8) | (num<<8));
    }
}
