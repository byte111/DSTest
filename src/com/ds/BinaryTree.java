package com.ds;

/**
 * Created by dbhattac on 2/9/2017.
 */
public class BinaryTree {

static String seq="";
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

    public static void main(String args[])
    {
        BinaryTree. Node na = new BinaryTree().new Node(7);
        BinaryTree. Node nb = new BinaryTree().new Node(5);
        BinaryTree. Node nc = new BinaryTree().new Node(10);
        BinaryTree. Node nd = new BinaryTree().new Node(4);
        BinaryTree. Node ne = new BinaryTree().new Node(6);
        BinaryTree. Node nf = new BinaryTree().new Node(9);
        BinaryTree. Node ng = new BinaryTree().new Node(12);

        na.left = nb;
        na.right = nc;
        nb.left = nd;
        nb.right = ne;
        nc.left = nf;
        nc.right = ng;

        // Tree is all set now


        iterate(na);

        System.out.print(seq);

    }

    private static void iterate(Node root)
    {
        if(root == null)
        {
            return;
        }

        iterate(root.left);
        seq = seq+","+root.data;
        iterate(root.right);
    }

}
