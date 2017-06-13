package com.ds4;

import java.util.*;

/**
 * Created by dbhattac on 4/9/2017.
 */
public class KruskalMST {
   static class Edge implements Comparable<Edge>
    {
        char src,dest;
        int weight;
        boolean srcvisited =false,destvisited = false;
        Edge(char src,char dest,int weight)
        {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        public int hashcode()
        {
            return (int)src + (int)dest;
        }

        public boolean equals(Object o )
        {
            return ((Edge)o).src == this.src && ((Edge)o).dest == this.dest ||
                    ((Edge)o).src == this.dest && ((Edge)o).dest == this.src  ||
                    ((Edge)o).dest == this.src && ((Edge)o).src == this.dest ;
        }

        public int compareTo(Edge e)
        {
            return this.weight - e.weight;
        }
    }

    char visited[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    public void mst(ArrayList<Edge> weightlist)
    {
        HashMap<Edge,Boolean> visitedmap = new HashMap<>();
        for(Edge e : weightlist)
        {
           if( visitedmap.get(e) == null && !isVisited(e))
           {
               visited[e.src] = e.src;
               visited[e.dest] = e.dest;
               visitedmap.put(e,true);
           }
        }

        print(visitedmap);
    }

    public void sortweight(ArrayList<Edge> weightlist)
    {
        Collections.sort(weightlist);
    }

    public void print( HashMap<Edge,Boolean> spanningtree)
    {
        Iterator it = spanningtree.keySet().iterator();
        while(it.hasNext())
        {
            Edge e = (Edge) it.next();
            System.out.println(e.src + " " + e.dest + " " + e.weight);
        }
    }

    public boolean isVisited(Edge e)
    {
        System.out.print(e.src + " " + e.dest);
        return visited[e.src] != ' ' &&  visited[e.dest] != ' ';
    }

    public static void main(String a[])
    {

        KruskalMST.Edge e0 = new KruskalMST.Edge('0','1',4);
        KruskalMST.Edge e1 = new KruskalMST.Edge('1','2',8);
        KruskalMST.Edge e2 = new KruskalMST.Edge('2','3',7);
        KruskalMST.Edge e3 = new KruskalMST.Edge('3','4',9);
        KruskalMST.Edge e4 = new KruskalMST.Edge('4','5',10);
        KruskalMST.Edge e5 = new KruskalMST.Edge('3','5',14);
        KruskalMST.Edge e6 = new KruskalMST.Edge('2','5',4);
        KruskalMST.Edge e7 = new KruskalMST.Edge('5','6',2);
        KruskalMST.Edge e8 = new KruskalMST.Edge('6','8',6);
        KruskalMST.Edge e9 = new KruskalMST.Edge('2','8',2);
        KruskalMST.Edge e10 = new KruskalMST.Edge('6','7',1);
        KruskalMST.Edge e11 = new KruskalMST.Edge('7','8',7);
        KruskalMST.Edge e12 = new KruskalMST.Edge('7','1',11);
        KruskalMST.Edge e13 = new KruskalMST.Edge('7','0',8);

        ArrayList<Edge> weightlist = new ArrayList<>();
        weightlist.add(e0);
        weightlist.add(e1);
        weightlist.add(e2);
        weightlist.add(e3);
        weightlist.add(e4);
        weightlist.add(e5);
        weightlist.add(e6);
        weightlist.add(e7);
        weightlist.add(e8);
        weightlist.add(e9);
        weightlist.add(e10);
        weightlist.add(e11);
        weightlist.add(e12);
        weightlist.add(e13);

        KruskalMST obj = new KruskalMST();
        obj.sortweight(weightlist);
        obj.mst(weightlist);

    }
}
