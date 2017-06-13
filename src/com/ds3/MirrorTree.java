package com.ds3;

/**
 * Created by dbhattac on 3/21/2017.
 */
class Node
{
    Node left,right;
    int data;
    Node(int data)
    {
        this.data = data;
    }
}
public class MirrorTree {


    public Node mirror(Node start)
    {
        if(start == null)
            return start;

        Node t1 = mirror(start.left);
        Node t2 = mirror(start.right);

        start.left = t2;
        start.right = t1;
        return  start;
    }

    public void display(Node start)
    {
        if(start == null)
            return;

        display(start.left);
        System.out.print(start.data + " , ");
        display(start.right);
    }

    public static void main(String args[])
    {
        MirrorTree obj = new MirrorTree();
        Node n1= new Node(10);
        Node n2= new Node(6);
        Node n3= new Node(4);
        Node n4= new Node(8);
        Node n5= new Node(14);
        Node n6= new Node(12);
        Node n7= new Node(16);

        n1.left = n2;
        n1.right = n5;
        n2.left = n3;
        n2.right = n4;

        n5.left = n6;
        n5.right = n7;

        System.out.println("original tree");
        obj.display(n1);
        System.out.println("mirror tree");

        obj.mirror(n1);
        obj.display(n1);
    }
}
