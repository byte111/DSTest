
package com.ds;

/**
 * Created by dbhattac on 2/23/2017.
 */
public class BTree {


    int arr[]= new int[10];
    int i=0 ;
    Node prev = null;
    public static void main(String args[])
    {
        Node node[] = new Node[15];
        int path[] = new int[1000];
        for(int i  = 1 ; i <= 15; i++)
        {
            Node n = new Node();
            n.val =  i ;
            node[i-1] = n;
        }

        for(int i = 0 ; i < 15/2; i ++)
        {
            Node n = node[i];
            if(i==0)
            {
                n.parent = null;
            }
            else
            {
                n.parent = node[(i+1)/2];
            }
            n.left  =  node[((i+1)*2)-1];
            n.right  =  node[((i+1)*2)];
            n.traversed = false;
        }

    BTree bt = new BTree();

        bt.traverse(node[0],path,0);
        bt. print();
    }

    public void print()
    {
        for(int i : arr)
        {
            System.out.println(i );
        }

    }


    public  void traverse(Node start,int a[],int pathlen)
    {
        if(start == null)
        {
            return;
        }

        a[pathlen++] = start.val;

        if(start.left == null && start.right == null)
        {
            printArray(a,a.length);
        }
        else
        {
            traverse(start.left,a,pathlen);
            traverse(start.right,a,pathlen);
        }


    }

   public  void printArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

}

class Node
{
    int val;
    Node left,right;
    Node parent;
    boolean traversed;
}
