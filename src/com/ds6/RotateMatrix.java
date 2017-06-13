package com.ds6;

/**
 * Created by dbhattac on 5/20/2017.
 */
public class RotateMatrix {

    static void rotatematrox(int arr[][])
    {
        if(arr== null ) return;
        int n = arr.length -1  ;
        for(int i =0;;i++)
        {
            for(int j=i;j<n-i;j++)
            {


                int t1 = arr[j][n-i];
                arr[j][n-i] = arr[i][j];
                int t2 = arr[n-i][n-j];
                arr[n-i][n-j] = t1;
                t1= arr[n-j][i];
                arr[n-j][i] = t2;
                arr[i][j] = t1;

            }
            if(i>= n-1) break;
        }

      //  print(arr);
    }

    static void print(int arr[][])
    {
        for(int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("["  + arr[i][j] + "]  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int arr[][]={{1,2},
                {3,4}
             };
        System.out.println("==== Before Matrix Rotation =======");
        RotateMatrix.print(arr);
        RotateMatrix.rotatematrox(arr);
        System.out.println("==== After Matrix Rotation =======");
       RotateMatrix.print(arr);


      //  System.out.println("==>"+2%100);
    }
}
