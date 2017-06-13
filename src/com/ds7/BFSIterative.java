package com.ds7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dbhattac on 5/27/2017.
 */
public class BFSIterative {

   static  class Coordinate{
        int i,j;
        Coordinate(int i,int j)
        {
            this.i = i;
            this.j=j;
        }
    }
    static void BFStraverse(int graph[][],boolean visited[][])
    {
        List queue = new ArrayList();
        while(true)
        {
            for(int i =0;i<graph.length;)
            {
                for(int j = 0 ;j<graph.length;j++)
                {
                    if(graph[i][j] == 0 ) continue;
                    if(visited[i][j]) continue;
                    visited[i][j] = visited[j][i] = true;
                    System.out.print("["+i + " ," + j+"]");
                    queue.add(new Coordinate(i,j));

                }
               if(queue.size() > 0) {
                   i = ((Coordinate) queue.get(0)).j;
                   queue.remove(0);

               }
                else
                    i++;

            }
            System.out.println();
            if(queue.size() == 0)
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
        BFSIterative.BFStraverse(graph,visited);
    }
}
