package com.ds5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dbhattac on 4/22/2017.
 */
public class PrimeNum {

    static void prime(int n )
    {
        ArrayList factors = new ArrayList();
         ArrayList primefactors = new ArrayList();
        for(int i  = 2; i*i < n;i++)
        {
            if(n%i==0) factors.add(i);
        }


       for(int i  = 0 ; i< factors.size();i++)
        {
            int f = (Integer)factors.get(i);
            if(f==2 || f==3 )
            {
                primefactors.add(f);
                continue;
            }
            boolean isprime = true;

            for(int j  = 0 ; j< i;j++)
            {
                int f1 = (Integer)factors.get(j);
                if(f%f1 ==0)
                {
                    isprime = false;
                    break;
                }
            }
            if(isprime)
            {
                primefactors.add(f);
            }

        }

        for(Object i : primefactors)
            System.out.print(i + " ,");
    }
    public static void main(String args[])
    {
        PrimeNum.prime(3);
    }
}
