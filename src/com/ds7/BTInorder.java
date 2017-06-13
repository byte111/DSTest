package com.ds7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbhattac on 5/29/2017.
 */
public class BTInorder {
    List<Integer> nodes = new ArrayList<>();
    public List<Integer> inorderTraversal(Node root) {
        traverse(root);
        return nodes;
    }

    public void traverse(Node root)
    {
        if(root== null) return;
        traverse(root.left);
        nodes.add(root.data);
        traverse(root.right);
    }

    public static void main(String args[])
    {
        BTInorder obj = new BTInorder();


        Node node2 = new Node(2);
        Node node1 = new Node(1);
        Node node3 = new Node(3);


        node1.right = node2;
        node2.left = node3;

        obj.traverse(node1);

        System.out.print(obj.nodes.toString());

    }

}
