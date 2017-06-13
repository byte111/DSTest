package com.ds4;

/**
 * Created by dbhattac on 4/9/2017.
 */
public class MaxHeap {


    public static void maxheapify(int a[])
    {
        for(int i = 0; a.length > (2*i+1) ; i++)
        {
            if(a.length >  (2*i+1))
            {
                if(a[i] < a[2*i+1])
                {
                    int t = a[i];
                    a[i] = a[2*i+1];
                    a[2*i+1] = t;

                    int t1 = i;
                    while(t1 > 0 )
                    {
                        if(a[t1/2] < a[t1])
                        {
                            int t2 = a[t1];
                            a[t1] = a[t1/2];
                            a[t1/2] = t2;
                        }
                        t1 = t1/2;
                    }
                }
            }

            if(a.length >  (2*i+2))
            {
                if(a[i] < a[2*i+2])
                {
                    int t = a[i];
                    a[i] = a[2*i+2];
                    a[2*i+2] = t;

                    int t1 = i;
                    while(t1 > 0 )
                    {
                        if(a[t1/2] < a[t1])
                        {
                            int t2 = a[t1];
                            a[t1] = a[t1/2];
                            a[t1/2] =t2;
                        }
                        t1 = t1/2;
                    }
                }
            }
        }

        for(int i : a)
        {
            System.out.print(i + " , ");
        }
    }

    public static void main(String a[])
    {
        int arr[] = {1,3,6,5,9,8};
        MaxHeap.maxheapify(arr);

        new MaxHeap().hashCode();
    }
}
