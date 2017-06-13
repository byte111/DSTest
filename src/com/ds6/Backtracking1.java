package com.ds6;


/**
 * Created by dbhattac on 4/30/2017.
 */
public class Backtracking1 {
    static boolean isSafe(int arr[][],int i,int j)
    {
        if(arr[i][j] == -1) return false;
        for(int ii=i;ii>=0;ii--)
            if(arr[ii][j] == 1) return false;
        for(int ii=i,jj=j;ii>=0 && jj>=0;ii--,jj--)
            if(arr[ii][jj]==1) return false;
        for(int ii=i,jj=j;ii>=0 && jj <arr.length ; ii --, jj++)
            if(arr[ii][jj]==1) return false;
        return true;
    }

    static boolean NQueens(int arr[][],int row,int col)
    {
        if(row == arr.length)
            return true;
        if(col == arr.length )
            return false ;
        if(isSafe(arr,row,col))
        {
            arr[row][col] = 1;
           boolean v =  NQueens(arr,row+1,0);

            if(v)
                return true;
            arr[row][col] = -1;
            return false;

        }
        else {
           return NQueens(arr, row, col + 1);
        }

    }

    static void check(int arr[][])
    {
        int i = 0 ;
        boolean v= false;
        while(i < arr.length)
        {
          v =  NQueens(arr,0,i);

            if(v) break;
            i++;

        }
        if(v) print(arr);
        else System.out.println("No solution found.");


    }

    static void print(int arr[][])
    {
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++)
            {  System.out.print(arr[i][j] + " ");}
            System.out.println();
        }
        System.out.println("======================");
    }

    public static void main(String args[])
    {
        int arr[][] = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};

        Backtracking1.check(arr);
      //  Backtracking1.print(arr);
    }
}
