package com.ds4;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dbhattac on 4/10/2017.
 */
public class GraphTraversal {
    public static LinkedList<Integer> adj[] = new LinkedList[5];
    public static LinkedList<Integer> queue = new LinkedList<>();
    public static void DFSTraversal(boolean visited[],int v)
    {
        visited[v] = true;

        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].iterator();

        while(it.hasNext())
        {
            int t = (int)it.next();
            if(!visited[t])
            {
                DFSTraversal(visited,t);
            }
        }
    }

    public static void BFSTraversal(boolean visited[],int v)
    {
        visited[v] = true;

        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext())
        {
            int t = (int)it.next();
            if(!visited[t])
            {
                visited[t] = true;
                queue.add(t);
            }
        }

        if(queue.size() > 0)
        {
            int t = queue.get(0);
            queue.remove(0);
            BFSTraversal(visited,t);
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
    //    GraphTraversal.DFSTraversal(v,1);
        GraphTraversal.BFSTraversal(v,1);
    }


}
