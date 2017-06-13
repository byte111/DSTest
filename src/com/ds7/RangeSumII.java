package com.ds7;

import java.util.Arrays;

/**
 * Created by dbhattac on 5/29/2017.
 */
public class RangeSumII {

    int max = Integer.MIN_VALUE;
    int count = 0;
    public void rangeSum(int m[][],int opr[])
    {

        int a = opr[0] ;
        int b = opr[1];
        for(int i  = 0; i < a; i++)
        {
            for(int j = 0;j<b;j++)
            {
                m[i][j]+=1;
                if(max < m[i][j]) {
                    max = m[i][j];
                    count = 0;
                }
                if(m[i][j] == max) count++;
            }
        }
    }

    public void operations(int m[][],int operations[][])
    {
        if(m == null || m.length == 0) return;
        if(operations == null || operations.length == 0) return;

        for(int i =0;i<operations.length;i++)
        {
            if(m.length < operations[0].length || m[0].length < operations[1].length) continue;

            if(operations[i].length != 2) continue;
            rangeSum(m,operations[i]);
        }
    }

    public static void main(String args[])
    {
        RangeSumII obj = new RangeSumII();
       int m[][] = {
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                    };

        int operations[][] = {
                        {2,2},
                        {3,3},
                        {3,3},
                        {3,3},
                        {2,2},
                        {3,3},
                        {3,3},
                        {3,3},
                {2,2},
                {3,3},
                {3,3},
                {3,3}

        };


        obj.operations(m,operations);

        System.out.print(" Maximum =" + obj.max + " Count = " + obj.count );

    }

}
