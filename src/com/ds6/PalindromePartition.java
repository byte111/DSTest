package com.ds6;

import java.util.List;

/**
 * Created by dbhattac on 5/19/2017.
 */
public class PalindromePartition {

    public void  generate(String s)
    {
        for(int i = 0 ;i<s.length();i++)
        {
            permute(s.toCharArray(),0,i);
        }
    }

    public void permute(char s[],int k , int i)
    {
        if(i==k)
        {
            System.out.println(new String(s).substring(0,k));
            return;
        }
   /*     String str = new String(s);
        System.out.println(str.substring(i,k-1));*/

        for(int j =k;j<=i;j++)
        {
            char t = s[j];
            s[j] = s[k];
            s[k] = t;
            permute(s,k+1,i);
            t = s[j];
            s[j] = s[k];
            s[k] = t;
        }
    }

    public static void main(String args[])
    {
        PalindromePartition obj = new PalindromePartition();
        obj.generate("abc");
    }
}
