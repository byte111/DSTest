package com.ds1;

/**
 * Created by dbhattac on 3/18/2017.
 */
public class Largestnum {

    public static void finamax(int arr[])
    {
        int max1 = 0 , max2 = 0;
        for(int i  = 0 ; i< arr.length ; i++)
        {
            if( arr[i] > max1 )
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)
            {
                max2 = arr[i];
            }

        }

        System.out.print("max1="+max1+" max2="+max2);
    }

    public static void main(String args[])
    {
        int arr []= {3,2,1,4,5,61,10};
        Largestnum.finamax(arr);
    }
}
