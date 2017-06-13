package com.ds7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dbhattac on 5/26/2017.
 */
public class AnagramSort {

    static ArrayList<String> anagrams = new ArrayList<>();
    public static void getAnagrams(String str,int pos) throws Exception
    {
        try {
            for (int i = 0; i < str.length(); i++) {
                //System.out.println(permute(str.toCharArray(),i));
                permute(str.toCharArray(), i);
            }

            Collections.sort(anagrams);
        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
        /*for(int i =0;i<anagrams.size();i++)
        {
            System.out.println(anagrams.get(i));
        }*/

        if(pos > anagrams.size())
            throw new Exception("Requested anagram not found");
        System.out.println(anagrams.get(pos-1));

    }

    public static void permute(char c[],int k)
    {
        if(k == c.length)
        {
            if(!anagrams.contains(new String(c)))
            anagrams.add(new String(c));
           // System.out.println(c);
        }
        for(int j  = k ; j < c.length;j++)
        {
            char t  = c[k];
            c[k] = c[j];
            c[j] = t;

            permute(c,k+1);

            t  = c[k];
            c[k] = c[j];
            c[j] = t;

        }
    }

    public static void main(String args[]) throws Exception
    {
        try {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();

            for (int i = 0; i < N; i++) {
                String input = s.next();
                int pos = s.nextInt();
                AnagramSort.getAnagrams(input,pos);
                anagrams = new ArrayList<>();
            }


        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }
}
