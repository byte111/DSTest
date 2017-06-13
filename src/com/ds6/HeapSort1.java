package com.ds6;

/**
 * Created by dbhattac on 5/21/2017.
 *
 * Recursive approach for creating a heap ..  If visualized as a binary heap, this array is sorted.
 */
public class HeapSort1 {
    static void heapSort(int arr[],int range)
    {
        if(arr == null ) return;
        int l = 0;
        while((2*l+1) <= range)
        {

            if(((2*l)+2) < arr.length)
            {
                if(arr[2*l+1] < arr[2*l+2])
                {
                    int temp = arr[2*l+1];
                    arr[2*l+1] = arr[2*l+2];
                    arr[2*l+2] = temp;
                }
            }


            if(((2*l)+1) <= range)
            {
                if(arr[l] < arr[2*l+1])
                {
                    int temp = arr[2*l+1];
                    arr[2*l+1] = arr[l];
                    arr[l] = temp;

                    heapSort(arr,l);
                }
            }

            if(((2*l)+2) <= range)
            {
                if(arr[l] < arr[2*l+2])
                {
                    int temp = arr[2*l+2];
                    arr[2*l+2] = arr[l];
                    arr[l] = temp;
                    heapSort(arr,l);
                }
            }
            l++;
        }
    }

    public static void print(int arr[])
    {
        for(int i :arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {3,2,4,5,9,77,6};
        System.out.println(" === Before Sorting ====== ");
        HeapSort1.print(arr);
        HeapSort1.heapSort(arr,arr.length-1);
        System.out.println(" === After Sorting ====== ");
        HeapSort1.print(arr);
    }
}
