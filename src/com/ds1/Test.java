package com.ds1;

import java.util.ArrayList;

/**
 * Created by dbhattac on 3/7/2017.
 */
public class Test {

    public static void main(String args[])
    {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        for(Integer i : data)
        {
            data.remove(1);
        }
    }
}
