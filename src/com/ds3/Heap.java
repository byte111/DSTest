package com.ds3;

/**
 * Created by dbhattac on 3/29/2017.
 */
public class Heap {

    /*public static boolean checkHeap1(int a[],int i )
    {
        if(i >= a.length)
            return true;
        return (((2*i+1) > a.length) && a[i] > a[2*i+1] &&  (((2*i+1) > a.length)) &&  a[i] > a[2*i+2]) && checkHeap(a,2*i+1) && checkHeap(a,2*i+2);
    }*/

    static boolean  solution = true;
    public static boolean checkHeap(int a[],int i,boolean prev )
    {
        if(i>=a.length)
            return true;

        if(!prev)
            return  false;

        boolean left = true,right=true;
        if((2*i+1) < a.length)
            if(a[i] >= a[2*i+1])
                left = true;
            else
                left=false;
        if((2*i+2) < a.length)
            if(a[i]>a[2*i+2])
                right=true;
            else
                right=false;

        prev = prev && left && right;
        if(!prev)
            solution= false;
        checkHeap(a,2*i+1,prev);
        checkHeap(a,2*i+2,prev);

        return solution;
    }

    public static void main(String args[])
    {
        int a[] = {90, 15, 10, 7, 12, 2, 7, 3};
        System.out.print(Heap.checkHeap(a,0,true));
    }
}

