package com.ds3;

import java.util.LinkedList;

/**
 * Created by dbhattac on 3/28/2017.
 */
public class RatInAMaze {

    private static LinkedList<String> path = new LinkedList<String>();
    public static void traverse(int a[][],int i ,int j)
    {
        if(i == a.length  || j == a.length )
            return ;

        if(a[i][j]!=1) {
           /*if(path.size() >0)
                path.remove(path.size()-1);*/
            return ;
        }
        path.add(i+""+j);

        traverse(a,i+1,j);

        traverse(a,i,j+1);

    }

    public static void main(String args[])
    {
        int matrix[][] = {{1,0,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {0,1,1,0}};
        RatInAMaze.traverse(matrix,0,0);

        for(String i : path)
        {
            System.out.println(i);
        }
    }

}

