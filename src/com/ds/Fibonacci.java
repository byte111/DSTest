package com.ds;

/**
 * Created by dbhattac on 2/10/2017.
 */
public class Fibonacci {


    public static void main(String args[])
    {
        int i  = 0 , j =1  ,count = 0 ;
        while(count <=30)
        {
            System.out.print(j+"  ");
            int temp = i;
            i= j ;
            j = temp + j;
            count++;
        }
    }
}
