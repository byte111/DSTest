package com.ds4;

/**
 * Created by dbhattac on 4/10/2017.
 */
public class CreateBinaryTree {
   static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
        }

    }


    public static Node createTree(int arr[],int start,int end)
    {
        if(end < start)
            return null;
        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left  = createTree(arr,start,mid -1);
        root.right  = createTree(arr,mid+1,end);
        return root;
    }

    public static void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        CreateBinaryTree.Node  root = CreateBinaryTree.createTree(arr,0,arr.length-1);
        CreateBinaryTree.inorder(root);
    }
}
