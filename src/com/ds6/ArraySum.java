package com.ds6;

import java.util.Scanner;

/**
 * Created by dbhattac on 5/7/2017.
 */
public class ArraySum {
   /* public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            sum+= arr[arr_i];
        }

        System.out.print(sum);

    }*/
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int mindiff = a[0];

        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                if(a_i == a_j) continue;
                int t = a[a_i] - a[a_j];
                t = t < 0 ? 0-t : t;
                if(t<mindiff) mindiff = t;
            }
        }
        System.out.print(mindiff);
    }
}
