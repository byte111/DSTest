package com.ds6;

/**
 * Created by dbhattac on 4/30/2017.
 */
public class MergeSort {

    static void mergesort(int arr[],int low,int high)
    {
        if(low<high) {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);

           print(arr);
        }
    }

    static void merge(int arr[],int low,int mid,int high)
    {
        int m1[]= new int[mid-low+1];
        int m2[]= new int[high-mid];
        int i =0,j=0,k=0;
        while(i<m1.length)
        {
            m1[i] = arr[low+i];
            i++;
        }
        i=0;
        while(i<m2.length)
        {
            m2[i]  = arr[mid + i + 1];
            i++;
        }

        i=0;
        int result[] = new int[m1.length+m2.length];
        while(i<m1.length && j < m2.length)
        {
            if(m1[i] <= m2[j]) result[k++] = m1[i++];
           else if (m1[i] > m2[j]) result[k++] = m2[j++];

        }
        while(i<m1.length) result[k++] = m1[i++];
        while(j<m2.length) result[k++] = m2[j++];
        for(int ii = low;ii<=high;ii++)
            arr[ii] = result[ii-low];
    }

    static void print(int arr[])
    {
        for(int i:arr)
            System.out.print(i+",");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {-1, 2, 2, 111, 4, 6, 5, 3, 1};
        int arr1[] = {2, 2, 1, 3};
        int arr2[] = {2,2,5,4,1,3};
        MergeSort.mergesort(arr2,0,arr2.length-1);
    }
}
