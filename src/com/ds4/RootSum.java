package com.ds4;

/**
 * Created by dbhattac on 3/29/2017.
 */
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data = data;
    }
}
public class RootSum {
    public Node start;

    public static Node add(Node start)
    {
        if(start == null)
            return null;
        Node left = add(start.left);
        Node right = add(start.right);
        if(left!=null) {
            start.data = start.data + left.data;
        }
        if(right != null)
        {
            start.data = start.data  + right.data;
        }
        return start;
    }

    public static void print(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String args[])
    {
        Node n1= new Node(5);
        Node n2= new Node(2);
        Node n3= new Node(8);
        Node n4= new Node(1);
        Node n5= new Node(4);
        Node n6= new Node(6);
        Node n7= new Node(10);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;


        RootSum.print(n1);
       System.out.println("=============");
        RootSum.print( RootSum.add(n1));
    }
}
