package com.ds;

/**
 * Created by dbhattac on 2/24/2017.
 */
//Rotate a matrix by 90 deg
public class RotateMatrix {

    public static void main(String args[])
    {
        int a[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

         int b[][] = new int[a.length][a.length];
        for(int i  = 0 ; i < a.length ; i++)
        {
            for(int j  = a.length-1 ; j >= 0; j--)
            {
                b[j][i] = a[i][a.length-1-j];
            }
        }

        for(int i  = 0 ; i < a.length ; i++)
        {
            for(int j  = 0; j < a.length; j++)
            {
               System.out.print(b[i][j]+",");
            }
            System.out.println();
        }


    }
}
