package com.ds7;

/**
 * Created by dbhattac on 6/10/2017.
 */
public class SearchArr
{
    static boolean search(int arr[][],int key)
    {

        if(arr.length == 0) return false;
        int length = arr.length-1;
        for(int i   = 0 ; i < arr.length;i++)
        {
            if(key < arr[i][0])
                return false;
            if(key > arr[i][length])
                continue;
            if(key <=arr[i][length])
            {
                if(key == arr[i][length])
                    return true;
                length = length - 1;
                for(int j =0;j<=length;j++)
                {
                    if(key == arr[i][j]) return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int arr[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.print(SearchArr.search(arr,20));
    }
}
