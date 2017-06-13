package com.ds3;

/**
 * Created by dbhattac on 3/21/2017.
 */
public class Reverse {

    public char[] reverse(char[] s,int len)
    {
        if(len == s.length)
            return s;
       // System.out.print(s[len]);
        String ss =  ""+ reverse(s,len+1);
       // reverse(s,len-1);
        System.out.println("1"+new String(ss));
        return ss.toCharArray() ;
    }

    public static void main(String args[])
    {
        Reverse obj = new Reverse();
        String s = "HELLO";
       System.out.print(obj.reverse(s.toCharArray(),0).toString().toCharArray());

    }
}
