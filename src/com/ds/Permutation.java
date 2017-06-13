package com.ds;

import java.util.*;

/**
 * Created by dbhattac on 2/26/2017.
 */
public class Permutation {

    Set<String>  pemutaions = new LinkedHashSet<String>();
    public  void permute(String s,int i, int j )
    {
        if(i  == j)
        {
            System.out.println(s.toCharArray());
        }

            for(int k = i ; k <= j ; k ++) {
                s = swap(s,i,k);
                permute(s,i+1,j);
                s = swap(s,i,k);

            }
    }

    public String swap(String s , int i , int j  )
    {
        char temp[] = s.toCharArray();

        char x = temp[i];
        char y = temp[j];
        temp[i] = y;
        temp[j] = x;
        return  String.valueOf(temp);
    }

    public static void main(String args[])
    {
        String s= "ABC";
        Permutation p = new Permutation();

            p.permute(s,0,s.length()-1);


    }

}
