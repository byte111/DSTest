package com.ds3;

/**
 * Created by dbhattac on 3/21/2017.
 */
public class MergeSort {

    public void merge(int arr[],int l,int m,int r)
    {
        int n1 = m - l +1;
        int n2 = r- m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i =0;i<n1;i++)
        {
            L[i] = arr[l+i];
        }
        for(int i=0; i< n2;i++)
        {
            R[i] = arr[m+1+i];
        }


    }

    public void sort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);

        }
    }

}
