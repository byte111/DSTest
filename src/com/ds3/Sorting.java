package com.ds3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;

/**
 * Created by dbhattac on 3/26/2017.
 */
public class Sorting {
    public static  void sort(int a[])
    {
        for(int i = 0 ;i < a.length;i++)
        {
            for(int j = 0 ; j < a.length ; j++)
            {
                if(a[i] > a[j])
                {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }

        for(int i =0;i< a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static  void sort1(int a[])
    {
        for(int i = 0 ;i < a.length;i++)
        {
            for(int j = 0 ; j < a.length -1 ; j++)
            {
                if(a[j] > a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        for(int i =0;i< a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }

    //counting sort

    public static void countingsort(int a[])
    {
        int temp[] = new int[a.length+1];
        int out[] = new int[a.length+1];
        for(int i  = 0 ; i < temp.length;i++)
        {
            temp[i] = 0;
        }
        for(int i =0;i < a.length;i++)
        {
            temp[a[i]]+=1;
        }

        for(int i  = 1 ; i < temp.length;i++)
        {
            temp[i] = temp[i-1] + temp[i];
        }

        for(int i  = 0 ;i< a.length ; i++)
        {
           int index = a[i];
            int val = temp[index];

            out[val] = temp[index];
            temp[index]-=1;

        }

        print(out);


    }

    // bucket sort
    public static void bucketsort(double a[])
    {
        ArrayList buckets[] = new ArrayList[a.length];

        LinkedList b  = new LinkedList();

        double out[] = new double[a.length];
        for(int i = 0 ; i < a.length ; i++)
        {
            final ArrayList t  =  new ArrayList();
            final ArrayList t1;
            int index = new Double(a[i] * 1).intValue();
           if(buckets[index] == null || buckets[index].size() == 0)
           {

               t.add(a[i]);
               buckets[i] = t;

           }
           else
           {
               t1 = buckets[index];
               t1.add(a[i]);
           }

        }

        int counter = 0;
       /* for(int i = 0 ; i < buckets.length ; i++)
        {
            if(buckets[i].size() > 0)
            {
                double b[] = new double [buckets[i].size()];

                for(int  k =0 ; k< b.length;k++)
                {
                    b[k] = (double)buckets[i].get(k);
                }
                insertionsort1(b);

                for(int k=0;k< b.length;k++)
                {
                    out[counter++] = b[k];
                }
            }
        }*/

        for(int i = 0 ; i < out.length;i++)
        {
            System.out.print(out[i]);
        }

    }


    public static void insertionsort1(double a[])
    {
        for(int i =1;i<a.length;i++)
        {

            for(int j = 0 ; j< i ;j++)
            {
                if(a[i] < a[j])
                {
                    double t = a[i];

                    for(int k = i;k>j ;k--)
                    {
                        a[k] = a[k-1];
                    }

                    a[j] = t;

                }
            }
        }

        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }


    public static void insertionsort(int a[])
    {
        for(int i =1;i<a.length;i++)
        {

            for(int j = 0 ; j< i ;j++)
            {
                if(a[i] < a[j])
                {
                    int t = a[i];

                    for(int k = i;k>j ;k--)
                    {
                        a[k] = a[k-1];
                    }

                    a[j] = t;

                }
            }
        }

        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }

    public static void print(int a[] )
    {
        for(int i = 1 ; i < a.length ;i ++)
        {
            System.out.print(a[i] + " ");
        }
    }




    public void radixsort(int a[])
    {
        for(int i =0;i<a.length;i++)
        {

        }
    }
    public static void main(String args[])
    {
        int a[] = {4,3,2,1,5,6};
        double ar[] = {4.290,4.123,4.124,3.213,0.23,3.34};
        //Sorting.sort1(a);
       // Sorting.countingsort(a);
       // Sorting.print(a);

      //  Sorting.insertionsort(a);

        Sorting.bucketsort(ar);
    }
}
