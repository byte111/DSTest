package com.ds6;

/**
 * Created by dbhattac on 5/19/2017.
 */
public class TarilingZeroes {

    public static void main(String args[])
    {
        int n = 5;
        int fact = 1;
        for(int i = 2; i<=5;i++) fact*=i;
       // fact = fact&(fact-1);
        System.out.println(fact);
        int test = fact&(fact-1);
        int count = 1;
       while(test !=0)
        {
            fact = fact >> 1;
            test = fact&(fact-1);
            count++;
        }
        System.out.println(count);
    }
}
