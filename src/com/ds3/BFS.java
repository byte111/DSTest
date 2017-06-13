package com.ds3;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dbhattac on 3/28/2017.
 */


public class BFS {

    private static LinkedList<Integer> adj[] = new LinkedList[5];

    private static LinkedList<Integer> queue= new LinkedList<Integer>();
    public static void DFStraversal(int v ,boolean visited[])
    {
        visited[v] = true;

        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].iterator();

        while(it.hasNext())
        {
            int n  = it.next();
            if(!visited[n])
            {
                DFStraversal(n,visited);
            }
        }
    }

    public static void BFStraversal(int v, boolean visited[])
    {
        visited[v]  = true;
        System.out.print( v + " ");
        Iterator it = adj[v].iterator();
        while(it.hasNext())
        {
            int n = (Integer)it.next();
            if(!visited[n] )
            {
                visited[n] = true;
                queue.add(n);
            }
        }

        if(queue.size() > 0) {
            int next = queue.get(0);
            queue.remove(0);
            BFStraversal(next, visited);
        }
    }



    public static void main(String args[])
    {
        LinkedList a = new LinkedList();
        a.add(1);
        a.add(4);
        adj[0] = a;

        LinkedList b = new LinkedList();
        b.add(0);
        b.add(2);
        b.add(3);
        adj[1] = b;


        LinkedList c = new LinkedList();
        c.add(1);
        c.add(3);
        adj[2] = c;

        LinkedList d = new LinkedList();
        d.add(1);
        d.add(2);
        d.add(4);
        adj[3] = d;

        LinkedList e = new LinkedList();
        e.add(0);
        e.add(3);
        adj[4] = e;

        boolean v[] = {false,false,false,false,false};
       // BFS.DFStraversal(0,v);
        BFS.BFStraversal(0,v);
    }
}
