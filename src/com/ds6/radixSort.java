package com.ds6;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class radixSort {

    public static void radixsort(int arr[])
    {
            int max = getMax(arr);
        int exp = 1;
        while(max/exp > 0)
        {
            arr = countingSort(arr,exp);
            exp*=10;
        }
        print(arr);
    }

    static int[] countingSort(int arr[],int exp)
    {
        int output[] = new int[10];
        int result[] = new int[arr.length];
        for(int i:output) output[i] =0;
        for(int i = 0 ; i < arr.length;i++)
        {
            output[(arr[i]/exp)%10]+=1;
        }
        for(int i =1;i<10;i++) output[i] +=output[i-1];
        for(int i = arr.length -1 ; i >=0 ; i--)
        {
            result[output[(arr[i]/exp)%10] -1 ] = arr[i];
            output[(arr[i]/exp)%10]-=1;
        }

        return result;
    }

    static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i +" ");
    }

    public static int getMax(int arr[])
    {
        int max = arr[0];
        for(int i :arr)
            if(i>max) max = i;
        return  max;
    }

    public static void main(String args[])
    {
        int arr[] = {4,3,2,5,5,16,7};
        System.out.println("== Before Sorting  ===== ");
        radixSort.print(arr);
        System.out.println("== After Sorting  ===== ");
        radixSort.radixsort(arr);

        System.out.println("test"+(2/10)%10);
    }
}
