package com.ds6;

import java.util.Arrays;

/**
 * Created by dbhattac on 5/23/2017.
 */
class Coordibate
{
    int row,col;
    public  Coordibate(int row,int col)
    {
        this.row = row;
        this.col = col;
    }

}
public class Maze {

    public static boolean traverse(int maze[][],Coordibate src,Coordibate dest,boolean visited[][])
    {
        if(src.row == maze.length || src.col == maze.length || src.row == -1 || src.col == -1 ) return false;
        if(maze[src.row][src.col] == 1 ) return false;
        if(visited[src.row][src.col] == true) return false;
        if(src.row == dest.row && src.col == dest.col)
        {
            System.out.print("found");
            return true;
        }

        visited[src.row][src.col] = true;

        return traverse(maze,new Coordibate(src.row-1,src.col),dest,visited) ||
                traverse(maze,new Coordibate(src.row+1,src.col),dest,visited) ||
                traverse(maze,new Coordibate(src.row,src.col-1),dest,visited) ||
                traverse(maze,new Coordibate(src.row,src.col+1),dest,visited);
    }

    public static void main(String args[])
    {
        int maze [][] = {
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,1,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0}
        };

        boolean visited [][] = new boolean[maze.length][maze.length];
       for(int i=0;i<maze.length;i++)
       {
           for(int j=0;j<maze.length;j++)
               visited[i][j] = false;
       }

        System.out.println(Maze.traverse(maze,new Coordibate(0,4),new Coordibate(4,4),visited));

    }

}
