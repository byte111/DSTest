package com.ds1;

/**
 * Created by dbhattac on 3/18/2017.
 */
public class MergeSort {

    public static void mergesort(int arr[],int i , int len)
    {
        if(i < len ) {
            int m  = (i+len)/2;
             mergesort(arr, i, m);

             mergesort(arr, m+1, len);
             merge(arr,i,m,len);
        }




    }

    public static void merge(int arr[],int i ,int m ,int len)
    {
        
        for(int k = 0 ; k < arr.length ; i++) {
            System.out.print(arr[k]);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {2,3,4,1,5,6};
        MergeSort.mergesort(arr,0,arr.length);
    }
}
