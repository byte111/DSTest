package com.ds4;

/**
 * Created by dbhattac on 3/30/2017.
 */
public class HeapSort {

    Node root;

    public Node heapify(Node root)
    {
        if(root == null)
            return null;
        Node left = heapify(root.left);
        Node right = heapify(root.right);

        int temp = root.data;

     //   if() left.data > right.data , right. ? left.data : right.data;
return  null;

    }
}
