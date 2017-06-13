package com.ds5;

/**
 * Created by dbhattac on 4/21/2017.
 */
public class RotateArray {

    static void rotatearray(int arr[],int k)
    {
        while(k > 0)
        {
            int temp = arr[arr.length-1];
            for(int i  = arr.length-1 ; i> 0 ; i --)
            {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            k--;
        }
    }

    static void print(int arr[])
    {
        for(int i =0;i<arr.length ; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
       /* int arr[] = {1,2,3,4,5,6,7};
        RotateArray.print(arr);
        RotateArray.rotatearray(arr,3);
        RotateArray.print(arr);*/
       int i  = 15;
        int a = -1;
       while(i>0) {
           a=a*10;

           i--;
       }

        System.out.println(a);

    }
}
