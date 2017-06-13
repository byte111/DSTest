package com.ds4;

import com.ds.BalancedExpr;

/**
 * Created by dbhattac on 4/8/2017.
 */
public class BanalcedTree {

    static class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data = data;
        }
    }

    static Node root;

    public static int maxdeppth(Node root)
    {
        if(root == null )
            return 0;
        int leftheight = maxdeppth(root.left);
        int rightgeight = maxdeppth(root.right);

        return leftheight < rightgeight ? rightgeight +1 : leftheight + 1;
    }

    public static void main(String args[])
    {

        BanalcedTree.Node n1 = new BanalcedTree.Node(1);
        BanalcedTree.Node n2 = new BanalcedTree.Node(2);
        BanalcedTree.Node n3 = new BanalcedTree.Node(3);
        BanalcedTree.Node n4 = new BanalcedTree.Node(4);
        BanalcedTree.Node n5 = new BanalcedTree.Node(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        System.out.print(BanalcedTree.maxdeppth(n1));

    }

}
