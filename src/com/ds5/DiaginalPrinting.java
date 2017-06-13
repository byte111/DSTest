package com.ds5;

/**
 * Created by dbhattac on 4/24/2017.
 */
public class DiaginalPrinting {

    static void print(int arr[][],int M,int N)
    {
        int count = 0 , i=0, j=0;
        boolean l2r = false;
        System.out.println("i=" + i + "j=" + j + "val=" +arr[0][0]);
        while(count < N)
        {
            if(!l2r)
            {
                 j = j+1;
                if(j>=N)
                {j=N-1; i+=2;}
                if(i<0)
                    i=0;
                for(;j>=0;j--)
                    System.out.println("i=" + i + "j=" + j + "val=" + arr[i++][j]);
                l2r= true;
            }
            else
            {
                i=i+1;
                if(i>=M)
                { i=M-1;
                    j+=2;}
                if(j<0)
                    j=0;
                for(;j<N;j++)
                    System.out.println("i=" + i + "j=" + j + "val=" +arr[i--][j]);
                l2r = false;
            }
            count++;
        }

    }
    public static void main(String args[])
    {
        int arr[][]={
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
                    DiaginalPrinting.print(arr,3,3);

    }
}
