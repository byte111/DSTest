package com.ds6;

import java.util.Scanner;

/**
 * Created by dbhattac on 5/7/2017.
 */
public class Excel {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int quo = 26;
        int remain = 0;
        String res="";
        char characters[] = {'A','B','C','D','E'};
        while(quo > 26)
        {
           remain = num%26;


            quo = num/26;
        }
    }
}
