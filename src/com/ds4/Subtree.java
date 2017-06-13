package com.ds4;

/**
 * Created by dbhattac on 4/11/2017.
 */
public class Subtree {
    static class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data = data;
        }
    }

    static boolean  matched = false;
    public static boolean replace(Node r1,Node r2,boolean isMatching)
    {
        if(r2 == null || r1 == null)
            return isMatching;

        boolean leftmatch = false, rightmatch = false;
        if(r1.data == r2.data)
        {
            leftmatch =  replace(r1.left,r2.left,true);
            rightmatch = replace(r1.right,r2.right,true);

            matched = leftmatch && rightmatch;
        }


        if(!leftmatch && !rightmatch) {
            replace(r1.left, r2,matched);
            replace(r1.right, r2,matched);
        }
        return matched;
    }

    public static void main(String a[])
    {
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

        Node n8= new Node(17);
        System.out.print(Subtree.replace(n1,n1,false));
    }

}

