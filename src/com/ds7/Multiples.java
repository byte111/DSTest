package com.ds7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbhattac on 6/10/2017.
 */
public class Multiples {


    static List groups  = new ArrayList();
    static void getGroups(int arr[],int i,int k )
    {
        if(i==k)
        {
            List temp = new ArrayList();
            int sum = 0;
            for(int i1 =0;i1<k;i1++)
            {
                sum+=arr[i1];
                temp.add(arr[i1]);
            }
            if(sum%3 == 0 )
                groups.add(temp);

        }

        for(int ii = i ; ii < arr.length ;ii++)
        {
            int t = arr[ii];
            arr[ii] = arr[i];
            arr[i] = t;
            getGroups(arr,i+1,k);
            t = arr[ii];
            arr[ii] = arr[i];
            arr[i] = t;
        }
    }
    static void shuffle(int arr[])
    {
        for(int i = 0 ;i<arr.length;i++)
        {
            getGroups(arr,i,2);
        }
        System.out.print(groups);
    }

    public static void main(String args[])
    {
        int arr[] = {3, 6, 7, 2, 9};

        Multiples.shuffle(arr);
    }

}
