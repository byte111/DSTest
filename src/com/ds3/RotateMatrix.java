package com.ds3;

/**
 * Created by dbhattac on 3/22/2017.
 */
public class RotateMatrix {

    public static void rotate(int a[][])
    {

        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0;j< a.length ; j++)
            {
                int temp = a[i][j];
                a[j][i] = a[a.length -1 - i ][j];
                a[a.length - 1- i][j] = temp;
            }
        }

        for(int i =0;i<a.length;i++)
        {
            for(int j =0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void rotate1(int a[][])
    {
        int n = a.length;
        int k = n/2;
        int i = 0 ;
        while(k > 0) {

            for (int j = 0; j <= n/2; j++)
            {
                print(a);
                System.out.println();
                int temp = a[j][n-i-1];
                a[j][n-i-1] = a[i][j];

                int temp1 =  a[n-i-1][n-j-1];
                a[n-i-1][n-j-1] =  temp;
                temp =a[n-j-1][i];
                a[n-j-1][i]  = temp1;
           //     a[n-i-1][j] = a[n-i-1][n-i-1];
                a[i][j] = temp;
            }



            k --;
            i++;

        }

        print(a);
    }

    public static void print(int a[][])
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j =0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int a[][]={
                    {1,2,3},
                    {5,6,7},
                    {9,10,11}

                };
        RotateMatrix.rotate1(a);
    }
}
