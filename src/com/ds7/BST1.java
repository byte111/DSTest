package com.ds7;

/**
 * Created by dbhattac on 5/27/2017.
 */
class Node
{
    Node left,right;
    int data;
    public Node(int data)
    {
        this.data = data;
    }
}
public class BST1 {

    static int count = 0;
    static int result = Integer.MIN_VALUE;
    public static void traverse(Node root,int k)
    {
        if(root == null) return ;

        traverse(root.left,k);


      count++;
        if(count == k)
        {
            result = root.data;
            return ;
        }


       traverse(root.right,k);

    }

    public static boolean isValidBST(Node root) {
        traverse(root);
       return isBST;
    }

    static boolean isBST = true;
    public static Node traverse(Node root)
    {
        if(root == null) return null;


        Node left = traverse(root.left);



        Node right= traverse(root.right);



        if(root!=null  )
        {
            if( ((left!= null && root.data <= left.data )|| ( right!= null && root.data >= right.data)))
            isBST = false;

        }

        if(isBST && left!= null && right!=null)
        {
            if(left.data < right.data)
                return left;
            else
                return root;
        }
        return root;
    }

    public static int kthSmallest(Node root, int k) {

    traverse(root,k);
        return result;
    }

    public static void main(String args[])
    {
        Node node10 = new Node(10);
        Node node5 = new Node(5);
        Node node15 = new Node(15);
        Node node6 = new Node(6);
        Node node20 = new Node(20);

        node10.left = node5;
        node10.right = node15;
        node15.left = node6;
        node15.right = node20;

/*        Node node8 = new Node(8);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node2 = new Node(2);*/
    /*    Node node1 = new Node(1);
        Node node11 = new Node(1);
        node1.left = node11;*/
        /*Node node3 = new Node(3);
        Node node9 = new Node(9);

        node8.left = node4;
        node8.right = node9;
        node4.left = node2;
        node4.right = node5;
        node2.left = node1;
        node2.right=node3;
*/
       // System.out.print(BST1.kthSmallest(node8,-1));
        System.out.print(BST1.isValidBST(node10));
        //System.out.print(output!=null ? output.data:null);
    }
}
