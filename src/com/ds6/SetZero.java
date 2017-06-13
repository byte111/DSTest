package com.ds6;

/**
 * Created by dbhattac on 5/20/2017.
 */
public class SetZero {

    static void setZero(int arr[][])
    {
        if (arr== null) return;
        for(int i =0;i<arr.length;i++)
        {
            for(int  j= 0 ;j < arr[i].length;j++)
                if(arr[i][j] == 0)
                    try {
                        arr[i][0] = arr[0][i] = 0;
                    }catch(ArrayIndexOutOfBoundsException e){}
        }


       /* for(int i=0;i <arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }*/

        for(int j = 0; j< arr.length ;j++)
        {
            if(arr[j][0] ==0)
            {
                for(int i =0;i<arr[j].length ; i++)
                    arr[j][i] = 0;
            }
        }

        for(int i=0;i< arr[0].length;i++)
        {
            if(arr[0][i] == 0)
            {
                for(int j=0;j < arr.length ;j++) arr[j][i] = 0;
            }
        }

      for(int i=0;i <arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int arr[][] = {{1,0}};

        SetZero.setZero(arr);
    }
}
