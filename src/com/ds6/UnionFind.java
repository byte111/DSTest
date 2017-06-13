package com.ds6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dbhattac on 4/30/2017.
 */
public class UnionFind {
    static class Edge
    {
        int src,dest;
        Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }

   static int nov  = 5;
   static int array[] = new int[nov];
   static
    {

        for(int i=0;i<nov;i++)
            array[i] = -1;
    }
    static boolean hasCycle(List<Edge> graph)
    {
        Iterator it = graph.iterator();
        while(it.hasNext())
        {
            Edge e = (Edge)it.next();
            if(find(e.src) == find(e.dest))
                return true;
            union(e.src,e.dest);

        }
        return false;
    }
    static int find(int vertex)
    {
        if(array[vertex] == -1)
            return vertex;
        return array[vertex];
    }
    static void union(int src,int dest)
    {
        array[dest] = find(src);
    }

    public static void main(String args[])
    {

       UnionFind.Edge e1 = new UnionFind.Edge(0,1);
       UnionFind.Edge e2 = new UnionFind.Edge(0,2);
       UnionFind.Edge e3 = new UnionFind.Edge(1,3);
       UnionFind.Edge e4 = new UnionFind.Edge(1,4);
       UnionFind.Edge e5 = new UnionFind.Edge(3,4);

        List<Edge> graph = new ArrayList<>();
        graph.add(e1);
        graph.add(e2);
        graph.add(e3);
        graph.add(e4);
        graph.add(e5);

        boolean val = UnionFind.hasCycle(graph);
        System.out.print(val);
    }
}
