package com.ds4;

/**
 * Created by dbhattac on 4/13/2017.
 */
public class NQueens {

    static int N = 4;
    public static boolean NQUtils(int arr[][],int col)
    {
        if(col >= N)
        {
            return true;
        }

        for(int i = 0 ; i <N; i++)
        {
            if(isSafe(arr,i,col))
            {
                arr[i][col] = 1;
                if(NQUtils(arr,col+1))
                    return true;
                arr[i][col] = 0;
            }
        }

        return false;
    }

    public static void print(int arr[][])
    {
        for(int i =0; i< N;i++)
        {
            for(int j =0; j< N;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int arr[][],int row,int col)
    {
        for(int i = 0 ;i<col;i++)
        {
            if(arr[row][i] == 1)
                return false;

        }
        for(int i =row , j = col ; i >0 && j > 0 ; i-- , j--)
        {
            if(arr[i][j] ==1)
                return false;
        }
        for(int i = row , j = col; i < N && j > 0; i++ ,j--)
        {
            if(arr[i][j]==1)
                return false;
        }
        return true;
    }

    public  static void main(String a[])
    {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        if(NQueens.NQUtils(board,0))
            NQueens.print(board);
    }
}
