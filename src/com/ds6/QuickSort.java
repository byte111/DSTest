package com.ds6;

/**
 * Created by dbhattac on 4/29/2017.
 */
public class QuickSort {

    static void quicksort(int arr[])
    {

        int i =0 , j = arr.length -1 , pi= (i+j)/2;
        for(int x=0;x<arr.length;x++)
        {
            i =0 ;
            j = arr.length -1;

            while (arr[i] < arr[pi])i++;
            while (arr[j]> arr[pi]) j--;

            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                print(arr);
            }
            else
                pi= pi-1;
        }
        print(arr);
    }

    static void print(int arr[])
    {
        for(int i:arr)
            System.out.print(i+",");
        System.out.println();
    }

    static void quuicksorrec(int arr[],int low,int high)
    {
        if(low < high)
        {

           int mid =  swap(arr, low, high);
            if(mid == -1)
                return;
            quuicksorrec(arr, low, mid -1 );
            quuicksorrec(arr, mid+1,high);

        }
        print(arr);
    }

    static int swap(int arr[],int low,int high)
    {
        int i = low , j = high;
        int pi = (low+high)/2;
        int part = arr[pi];
        while(i<j) {
            while (arr[i] < part) i++;
            while (arr[j] > part) j--;

            if(i!=j && arr[i] == arr[j] && arr[j] == part)
            {
                i++;
                j--;
                continue;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        if(arr[i] == part) return i;
        else return j;
    }

    public static void main(String args[])
    {
        int arr[] = {-1,2,2,111,4,6,5,3,1};
        int arr1[] = {2,2,1,3};
     //  QuickSort.quicksort(arr);
       QuickSort.quuicksorrec(arr,0,arr.length-1);

    }
}

