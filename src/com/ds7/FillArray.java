package com.ds7;

import java.util.Scanner;

/**
 * Created by dbhattac on 6/4/2017.
 */
public class FillArray {

    public static int filleArr(int arr[])
    {
        if(arr == null) return -1;
        if(arr.length == 1 && arr[0] == 1) return  0;
        if(arr.length == 1 && arr[0] == 0 ) return -1;
        boolean flag = true;
        int count = 0;
        while (flag) {
            for (int i = 0; i < arr.length; ) {

                if (arr[i] == 1)
                {
                    if(i>0 && arr[i-1] == 0)
                        arr[i-1] = 1;


                    if(i< arr.length && arr[i+1] == 0)
                    {
                        arr[i+1] = 1;
                        i+=2;
                    }
                    else
                        i++;
                }
                else
                    i++;
            }

            flag = false;
            for (int i = 0; i < arr.length; i ++)
            {

                if (arr[i] == 0)
                {
                    flag = true;
                    //System.out.print("i=" + i+ "arr[i]=" + arr[i]  + " : ");
                    //break;
                }

            }
           // System.out.println();

            count++;

        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T > 0)
        {
            int N = scanner.nextInt();
            int arr [] = new int[N];

            for(int i = 0;i<N;i++)
            {
                arr[i] = scanner.nextInt();
            }
            System.out.print(FillArray.filleArr(arr));
            T--;
        }
       // int arr[] = {0,0,1,1,0,0,1,1,0,1,1,1,1,0,0,0,1};
        //System.out.print(FillArray.filleArr(arr));
    }
}
