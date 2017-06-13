package com.ds;

/**
 * Created by dbhattac on 2/28/2017.
 */
 class X
{
    int y;
}
public class test implements Cloneable{
    int x;
    static X xx;
    public static void main(String args[])
    {
        test t = new test();
        xx = new X();
        xx.y = 10;
        t.x = 5;
        System.out.println(t.x + " , " + t.xx.y);
        try {
            test t2 = (test)t.clone();
            System.out.println(t2.x + " , " + t2.xx.y);

        }
        catch(CloneNotSupportedException  e)
        {
            e.printStackTrace();
        }
    }
}
