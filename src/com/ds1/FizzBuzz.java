package com.ds1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by dbhattac on 3/9/2017.
 */
public class FizzBuzz {

    public void printFizzBuzz(int start,int end)
    {
        for(int i  = start ; i <=end ; i++)
        {
            if(i%3==0 && i%5 ==0 )
            {
                System.out.println("FizzBuzz");
            }
           else  if(i%3== 0 )
            {
                System.out.println("Fizz");
            }
            else if(i%5 ==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }

        }


    }

    public static void main(String args[])
    {
        try {
            Scanner in = new Scanner(System.in);


           String[] val = new String[2];
            int i = 0;
            while (in.hasNextLine()) {
                if(i==2)
                    break;
                val[i++] = in.nextLine();
            }
            FizzBuzz obj = new FizzBuzz();
            String []nos = val[1].split(" ");
            for(int j  = 0 ; j < Integer.parseInt(val[0]) ; j ++)
            {
                obj.printFizzBuzz(1,Integer.parseInt(nos[i]));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
