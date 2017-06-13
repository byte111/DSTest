package com.ds6;

/**
 * Created by dbhattac on 5/21/2017.
 *
 * Iterative approach for creating a heap  . If visualized as a binary heap, this array is sorted.
 */
public class HeapSort {
    static void heapify(int arr[])
    {
        if(arr == null ) return;
        int l = 0;
        while((2*l+1) < arr.length)
        {

            if(((2*l)+2) < arr.length)
            {
                if(arr[2*l+1] < arr[2*l+2])
                {
                    int temp = arr[2*l+1];
                    arr[2*l+1] = arr[2*l+2];
                    arr[2*l+2] = temp;
                }
            }
            if(((2*l)+1) < arr.length)
            {

                if(arr[l] < arr[2*l+1])
                {
                    int temp = arr[2*l+1];
                    arr[2*l+1] = arr[l];
                    arr[l] = temp;

                    int t1 = l;
                    while(((l-1)/2) >=0)
                    {
                        if(arr[(l-1)/2] < arr[l])
                        {
                            int t = arr[(l-1)/2];
                            arr[(l-1)/2] = arr[l];
                            arr[l] = t;
                        }

                        if((((l-2)/2) < 0)) break;

                        if(arr[(l-2)/2] < arr[l])
                        {
                            int t = arr[(l-2)/2];
                            arr[(l-2)/2] = arr[l];
                            arr[l] = t;
                        }
                        l--;
                    }
                    l= t1;
                }
            }

            if(((2*l)+2) < arr.length)
            {

                if(arr[l] < arr[2*l+2])
                {
                    int temp = arr[2*l+2];
                    arr[2*l+2] = arr[l];
                    arr[l] = temp;

                    int t1 = l;

                    while(((l-1)/2) >=0)
                    {

                        if(arr[(l-1)/2] < arr[l])
                        {
                            int t = arr[(l-1)/2];
                            arr[(l-1)/2] = arr[l];
                            arr[l] = t;
                        }

                        if((((l-2)/2) < 0)) break;

                        if(arr[(l-2)/2] < arr[l])
                        {
                            int t = arr[(l-2)/2];
                            arr[(l-2)/2] = arr[l];
                            arr[l] = t;
                        }
                        l--;
                    }

                    l = t1;
                }
            }
            l++;
        }
    }

    public static void heapsort(int arr[])
    {
        int n = arr.length-1;
      //  for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
           if(arr[0] > arr[i])
           {
               int temp = arr[0];
               arr[0] = arr[i];
               arr[i] = temp;
           }

            // call max heapify on the reduced heap
            heapify(arr);
        }
    }

    public static void print(int arr[])
    {
        for(int i :arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {3,2, 4, 5 ,9 ,77 ,6 };
        System.out.println(" === Before Sorting ====== ");
        HeapSort.print(arr);
        HeapSort.heapsort(arr);
        System.out.println(" === After Sorting ====== ");
        HeapSort.print(arr);
    }
}
