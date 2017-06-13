package com.ds5;

/**
 * Created by dbhattac on 4/19/2017.
 */
public class WordLadder {

    static void permute(char word[] , int i ,int k)
    {
        if(  i == k )
        {
            for(int ii = 0 ; ii <  k ;ii++)
            {
                System.out.print(word[ii]);
            }
            System.out.println();
        }
        for(int ii  = i ; ii < word.length;ii++)
        {
            char temp = word[ii];
            word[ii] = word[i];
            word[i] = temp;

            permute(word,i+1,k);

            temp = word[ii];
            word[ii] = word[i];
            word[i] = temp;

        }
    }

    static void geberate(String word)
    {
        for(int i = 0 ; i < word.length() ; i ++)
            permute(word.toCharArray(),0,2);
    }

    public static void main(String args[])
    {
        WordLadder.geberate("hello");
    }
}
