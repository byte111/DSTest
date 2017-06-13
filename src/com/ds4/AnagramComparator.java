package com.ds4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dbhattac on 4/19/2017.
 */
public class AnagramComparator implements Comparator<String> {
    public int compare(String s1,String s2)
    {
        return sortChars(s1).compareTo(sortChars(s2));
    }

    public String sortChars(String s1)
    {
        char c1[] = s1.toCharArray();
        Arrays.sort(c1);
        return new String(c1);
    }

    public static void main(String args[])
    {
        String a[] = {"SUB","HELLO","BOY","ATE","BUS","TEA"};

        Arrays.sort(a,new AnagramComparator());

        for(String aa:a)
        {
            System.out.print(aa + " ");
        }
    }

}
