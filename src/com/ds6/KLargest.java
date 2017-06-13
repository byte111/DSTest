package com.ds6;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class KLargest {

    public static void hepify(int arr[],int k ,int range)
    {
        int l = 0;

        while(((2*l+1) < range ) && k>=0)
        {
            if(arr[2*l+1] < arr[l])
            {
                int temp =  arr[l];
                arr[l] = arr[2*l+1];
                arr[2*l+1] = temp;
                hepify(arr,k,l);
            }

            if((2*l+2) < arr.length)
            {

            }
        }
    }
}
