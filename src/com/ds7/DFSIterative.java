package com.ds7;

/**
 * Created by dbhattac on 5/26/2017.
 */
public class DFSIterative {

    public static void traverse(int graph[][],boolean visited[][])
    {
        boolean didTraverseOnce = false;
        int i =0;int j= 0;
        while (true)
        {
            for(; i <graph.length;)
            {
                j=0;
                didTraverseOnce = false;
                for(;j < graph.length;)
                {
                    if(visited[i][j]) { j++ ; continue;}
                    if(graph[i][j] == 0) { j++; continue;}
                    System.out.print("["+i + " , " + j + "] ");
                    visited[i][j] = visited[j][i] =  true;
                    i=j;
                    didTraverseOnce = true;
                    break;
                }
                if(!didTraverseOnce) {
                    System.out.println();
                    i++;
                }
            }

            if(!didTraverseOnce )
                break;
        }
    }

    public static void main(String args[])
    {
        int graph[][]={{0,1,0,0,1},
                {1,0,1,0,1},
                {0,1,0,1,1},
                {0,0,1,0,0},
                {1,1,1,0,0}};
        boolean visited[][] = new boolean[5][5];
        for(int i =0;i < 5;i++)
        {
            for(int j= 0 ;j<5;j++)
            {
                visited[i][j] = false;
            }
        }

        DFSIterative.traverse(graph,visited);
    }
}
