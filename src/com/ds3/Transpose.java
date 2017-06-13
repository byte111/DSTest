package com.ds3;

/**
 * Created by dbhattac on 3/26/2017.
 */
public class Transpose {

    public static void transpose(int a[][])
    {
        for(int i =0;i< a.length;i++)
        {
            for(int j =i;j< a.length;j++)
            {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i]  = t;
            }
        }
    }

    public static void print(int a[][])
    {
        for(int i =0;i< a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int a[][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        Transpose.print(a);
        Transpose.transpose(a);
        Transpose.print(a);
    }
}
