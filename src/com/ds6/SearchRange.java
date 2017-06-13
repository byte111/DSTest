package com.ds6;

/**
 * Created by dbhattac on 5/6/2017.
 */
public class SearchRange {
    static int[] search(int arr[],int low,int high,int pos[],int key)
    {

        if(arr.length == 0)
            return  new int[]{-1,-1};
        if(arr.length == 1 ) {
            if(arr[0] == key)
                return new int[]{0, 0};
            else
                return  new int[]{-1,-1};
        }
        if(low < high)
        {

            if(arr[low] == key) {
                pos[0] = low;

            }
            if(arr[high] == key) {
                pos[1] = high;

            }

           /* if(pos[0] != -1  && pos[1] != -1)
                return pos;*/
            int mid = (low+high)/2;
            if(key > arr[mid] )
                return search(arr,mid+1,high,pos,key);
            else if(key < arr[mid])
                return search(arr,low,mid-1,pos,key);
            else
            {
                if(pos[0] == -1)
                    pos[0] = mid;
                if(pos[1] == -1)
                    pos[1] = mid;
                int l[]= search(arr,low,mid-1,pos,key);
                int h[] = search(arr,mid+1,high,pos,key);
                pos[0] = l[0];
                pos[1] = l[1];
                return pos;
            }

        }

        if(pos[0] == -1 && pos[1]!=-1)
            pos[0] = pos[1];
        else if(pos[1] == -1 && pos[0] !=-1)
            pos[1] = pos[0];
        return pos;
    }

    public static void main(String args[])
    {
        int arr [] = {5, 7, 7, 8, 8, 10};
        int arr1 [] = {5};
        int pos [] = {-1,-1};

        int position []  = SearchRange.search(arr,0,arr.length-1,pos,5);
        System.out.print(pos[0] + " , " + pos[1]);
    }
}
