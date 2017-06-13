package com.ds7;

/**
 * Created by dbhattac on 5/26/2017.
 */
public class DFSRec {
    static void DFSrecursive(int graph[][],boolean visited[][],int i ,int j )
    {
        if(i == graph.length || j == graph.length-1)
        {

            return;
        }

        if (visited[i][j] || graph[i][j] == 0)
          {
              DFSrecursive(graph,visited,i,j+1);

              DFSrecursive(graph,visited,i+1,0);
          }
          else
        {
            visited[i][j] = visited[j][i] = true;
            System.out.print("["+i+","+j+"]");
            DFSrecursive(graph,visited,j,0);
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
       DFSRec.DFSrecursive(graph,visited,0,0);
   }
}
