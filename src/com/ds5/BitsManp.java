package com.ds5;


/**
 * Created by dbhattac on 4/22/2017.
 */
public class BitsManp {

    static void reverse(int n )
    {
        for(int i  = 0 ; i < 32 ; i++) {
            int t = n << 31;
            int t1 = n << 1;
            int t2 = n >> 1;

            System.out.println("t="+t);
            n = t|(t1^t2);
        }
    }
    public static void main(String args[])
    {
        //BitsManp.reverse(12);

        System.out.print(-12<<1);
    }
}
