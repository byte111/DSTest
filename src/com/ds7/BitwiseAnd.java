package com.ds7;

/**
 * Created by dbhattac on 5/29/2017.
 */
public class BitwiseAnd {
    public static void setbits(int n ,int  k )
    {
        int t = 1<<(k-1);
        int t1 = ~t;
        int t2 = n&t1;
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
    }

    public static void main(String args[])
    {
        BitwiseAnd.setbits(15,1);
        System.out.println("o="+0x2F);
    }
}
