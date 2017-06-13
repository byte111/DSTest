package com.ds4;

/**
 * Created by dbhattac on 4/18/2017.
 */
public class Subsets
{
static void subset(int arr[])
{
    for(int i =0 ; i < arr.length;i++)
    {
        permute(arr,0,i);
    }
}

static void permute(int arr[],int k,int limit)
{
    if(limit == k)
    {
        print(arr,limit);
    }

    else
    {
        for(int i =  k ; i < arr.length;i++)
        {
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            permute(arr,k+1,limit);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }
}

static void print(int arr[],int k)
{
    for(int i =0;i<k;i++)
    {
        System.out.print(arr[i]);
    }
    System.out.println();
}

public static void main(String args[])
{
    int arr[] = {2,3,4};
    Subsets.subset(arr);
}

}
