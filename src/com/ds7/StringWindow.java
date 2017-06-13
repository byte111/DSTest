package com.ds7;

/**
 * Created by dbhattac on 6/4/2017.
 */
public class StringWindow {
    public static int calculate(char arr[])
    {
        int ascii[] = new int[128];
        for(int i = 0 ; i <=127;i++)
        {
            ascii[i] =0;
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0 ;i < arr.length ;i++)
        {
         int val = ascii[arr[i]];

            ascii[arr[i] ] = i ;
            min = max = i;
        }

        for(int i =0;i<=127;i++)
        {
            if(ascii[i]!=0)
            System.out.println("i=" + i + " val="+ascii[i]);
        }

        for(int i =0;i<=127;i++)
        {
            if(ascii[i] == 0) continue;
            if(ascii[i] < min)
                min = ascii[i];
            if(ascii[i] > max)
                max = ascii[i];
        }

        return max-min;
    }

    public static void main(String args[])
    {
        System.out.print(StringWindow.calculate("dbca".toCharArray()));
    }

}
