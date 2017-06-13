package com.ds6;

/**
 * Created by dbhattac on 5/13/2017.
 */
public class RangeSearch {
    static int[] searchRange(int arr[])
    {
        for(int i =0,j=arr.length-1;i!=j;i++,j--)
        {
            if(arr[i] -arr[j] == 0) return new int[]{i,j};
        }

        return new int[]{-1,-1};
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,3,3,3,4,5,5,5,6,7};
        //RangeSearch.searchRange()
    }
}
