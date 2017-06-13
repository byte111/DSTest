package com.ds3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbhattac on 3/26/2017.
 */


public class VerticalTree {

    List<Node>  queue = new ArrayList<Node>();

    public void traverse(Node root)
    {
        if(root.left != null)
            traverse(root.left);
        System.out.print(root.data+" ");
        if(root.right != null)
            queue.add(root.right);
    }

    public void printqueue()
    {
        if(queue.size() == 0)
            return;
        if(queue.size() > 0)
        {
            Node t  = queue.get(0);
            if(t.left == null && t.right == null)

            {   System.out.print(t.data);
                queue.remove(0);
            }
            else {
                traverse(t);
                queue.remove(0);
            }

            printqueue();
        }
    }

    public static void main(String args[])
    {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        Node n6 = new Node(8);

        Node n7 = new Node(6);

        n1.left = n2;
        n2.left = n4;
        n2.right = n7;
        n3.left = n5;
        n3.right = n6;
        n1.right = n3;
        VerticalTree obj = new VerticalTree();
        obj.traverse(n1);
        obj.printqueue();
    }

}
