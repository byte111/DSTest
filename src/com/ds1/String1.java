package com.ds1;
import java.util.*;
/**
 * Created by dbhattac on 3/7/2017.
 */

/*Given a string, find the length of the longest substring without repeating characters.

        Examples:

        Given "abcabcbb", the answer is "abc", which the length is 3.

        Given "bbbbb", the answer is "b", with the length of 1.

        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring*/
public class String1 {

    public String longestSubs(String s)
    {
        String temp="";
        HashSet<String>  substr = new HashSet<String>();
        for(int i = 0 ; i< s.length(); i++)
        {
            if(temp.indexOf(s.charAt(i)) <0)
            {
                temp+=s.charAt(i);
            }
            else
            {
                substr.add(temp);
                temp = "";
                //i = i-1;
            }

        }

        substr.add(temp);
        int maxlen = -1;
        String longestsubstr = "";
        for(String ss : substr)
        {
            if(ss.length() > maxlen )
            {
                maxlen = ss.length();
                longestsubstr = ss;
            }
        }
        return longestsubstr;
    }

    public static void main(String args[])
    {
        String1  obj = new String1();
        System.out.print(obj.longestSubs("pwwkew"));
        try {
            System.out.println("\n"+obj.hashCode());
        }
        catch(Throwable t)
        {
            t.printStackTrace();
        }
    }
}
