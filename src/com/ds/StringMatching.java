package com.ds;

/**
 * Created by dbhattac on 2/9/2017.
 */
public class StringMatching {


    public static void main(String args[])
    {
        String input = "This is my world !!";
        String pattern = "is";

        int i = 0;
        for(  ; i  < input.length() ; i++)
        {
            if(input.charAt(i) != pattern.charAt(0))
            {
                continue;
            }
            else
            {
                int k=1;
                for( int j = i+1 ; (j  < input.length() && k < pattern.length()) ; j++,k++)
                {

                    if(input.charAt(j) != pattern.charAt(k))
                    {
                       break;
                    }

                }
                if(k==pattern.length())
                {
                    System.out.print("Match found !!");
                    break;
                }
            }
        }

        if(i == input.length())
        {
            System.out.print("Match not found !!");
        }


    }
}
