package com.ds1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dbhattac on 3/18/2017.
 */
public class Division {

   /* public static void main(String args[])
    {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        String input = "";
        input = in.nextLine();
        String num[] = input.split(" ");

        long a = Long.parseLong(num[0]);
        long b = Long.parseLong(num[1]);
        long limit = (a<b) ? a/2 : b/2;
        long common = 1;
        for(int i  =2 ; i<=  limit ; i++)
        {
            if(a%i == 0 && b%i ==0)
                common++;
        }
        System.out.println(common);
    }*/

    public static void main(String args[])
    {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        String noi = in.nextLine();
        int no_int  = Integer.parseInt(noi);
        String elem  = in.nextLine();
        String nos[] = elem.split(" ");
        int num[] = new int[nos.length];
        int count=0;
        int actsum = 0;

        for(String s: nos)
        {
            num[count] = Integer.parseInt(s);
            actsum+=num[count];
            count++;
        }

        int newnum = (actsum /no_int) +1 ;

        System.out.print(newnum);

    }
}
