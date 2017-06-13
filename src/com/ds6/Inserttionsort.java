package com.ds6;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class Inserttionsort {
   public static void insertionsort(int arr[])
   {
       if(arr == null || arr.length == 0) return;
        for(int i = 1;i<arr.length;i++)
        {
            for(int j = 0 ;j < i;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                   for(int k = i;k>=j+1;k--)
                       arr[k] = arr[k-1];
                    arr[j+1] = temp;
                    break;
                }
            }
        }

        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

   }

   public static void main(String args[])
   {
       int arr[] = {3,2,-4,-7,6,5};
       Inserttionsort.insertionsort(arr);
   }
}
