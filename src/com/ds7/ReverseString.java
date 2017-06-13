package com.ds7;

/**
 * Created by dbhattac on 5/27/2017.
 */
public class ReverseString
{
    static String reverese(char str[],int i ,int j )
    {
       if(i<j) {
           char temp = str[i];
           str[i] = str[j];
           str[j] = temp;
           reverese(str, i + 1, j - 1);
       }
        return new String(str);
    }
    public static void main(String args[])
    {
        String str = "PANDAMONIUM";
        System.out.print(ReverseString.reverese(str.toCharArray(),0,str.length()-1));
    }
}
