package com.ds3;

/**
 * Created by dbhattac on 3/29/2017.
 */
public class SelectionSort {
//bubble sort
    public static void bubble(int a[])
    {
        for(int i  = 0 ; i < a.length ; i++)
        {
            for(int j = i+1; j < a.length ; j++)
            {
                if(a[j] < a[i])
                {
                    int t = a[j];
                    a[j] = a[i] ;
                    a[i] = t;
                }
                print(a);
            }
        }
    }

    public static void selection(int a[])
    {
        for(int i =0;i < a.length;i++)
        {
            int min =a[i],pos=i;
            if(i > 0)
            {
                min = a[i-1];
                pos = i-1;
            }

            for(int j = i;j<a.length;j++)
            {
                if(min < a[j])
                {
                    min = a[j];
                    pos = j;
                }
            }

            if(pos!=i)
            {
                int t = a[i];
                a[i] = a[pos];
                a[pos] = t;
            }

            print(a);
        }
    }

    public static void print(int a[])
    {
        System.out.println();
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }

    }

    public static void main(String args[])
    {
        int a[] = {64,25,12,22,11};
        SelectionSort.print(a);
      //  SelectionSort.bubble(a);
        SelectionSort.selection(a);
    }
}
