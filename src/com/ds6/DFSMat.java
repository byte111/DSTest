package com.ds6;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class DFSMat {
    public static boolean traverse(int graph[][],Coordibate source,Coordibate destination,boolean visited[][])
    {
        if(source.row == destination.row && source.col == destination.col) return true;
        if(source.row == graph.length || source.col == graph.length || source.row == -1 || source.col == -1) return false;


        return false;
    }
    public static boolean traverse1(int graph[][],Coordibate source,Coordibate destination,boolean visited[][])
    {
        if(source.row == destination.row && source.col == destination.col) return true;
        for(int i =source.row ;i < graph.length;i++)
        {
            for(int j = source.col ; j < graph.length;j++)
            {
                if(visited[i][j]) continue;
                visited[i][j] = true;
               return traverse(graph,source,destination,visited);
            }
        }
        return false;
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


        System.out.print(DFSMat.traverse(maze,new Coordibate(0,4),new Coordibate(4,4),visited));

    }

}
