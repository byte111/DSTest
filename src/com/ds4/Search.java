package com.ds4;

/**
 * Created by dbhattac on 4/19/2017.
 */
public class Search {

    static int search(int arr[],int l,int r,int key)
    {

        if(l < r){
            int m = (l+r)/2;
            if(key == arr[m])
                return m;
            else if(key <=arr[m-1] && key >= arr[l])
            {
                if(key == arr[m-1])
                    return m-1;
                else if(key == arr[l])
                    return l;
                else
                 return    search(arr,l,m-1,key);
            }
            else
            {
                if(key == arr[m+1])
                    return m+1;
                else if(key == arr[r])
                    return r;
                else
                  return   search(arr,m-1,r,key);
            }

        }
        else
        {
            return -1;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {15,16,19,20,25,1,3,4,5,7,10,14};
        System.out.print(Search.search(arr,0,arr.length-1,10));
    }
}
