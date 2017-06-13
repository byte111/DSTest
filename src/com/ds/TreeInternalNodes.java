package com.ds;

/**
 * Created by dbhattac on 2/24/2017.
 */
public class TreeInternalNodes {

    public static void main(String args[])
    {
        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);
        Node1 n5 = new Node1(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;



        System.out.print(new TreeInternalNodes().count(n1));
    }

    public int count(Node1 n)
    {
        if(n == null)
        {
            return  0;
        }
        if(n.left == null && n.right == null)
        {
            return 0;
        }

        return 1+ count(n.left) + count(n.right);
    }
}
