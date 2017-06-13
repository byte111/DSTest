package com.ds;

/**
 * Created by dbhattac on 3/1/2017.
 */
public class BSTWithoutLeftChild {
TreeNode root;
    public void print(TreeNode root)
    {

        if(root == null )
            return;

       /* if(root.left == null)
        {
            System.out.println(root.data);

        }
        else
        {
            print(root.left);
            print(root.right);
        }*/

       print(root.left);
        if(root.left == null)
            System.out.println(root.data);
        print(root.right);

    }

    public static void main(String args[]) {
       TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(14);
        TreeNode n6 = new TreeNode(13);
        TreeNode n7 = new TreeNode(2);
        TreeNode n8 = new TreeNode(15);
        TreeNode n9 = new TreeNode(16);

        n1.left = n2;
        n1.right = n5;
        n2.left = n4;
        n2.right = n3;
        n5.left = n6;
        n4.left = n7;
        n5.right = n8;
        n8.right = n9;

       /* TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        n1.right = n2;
        n2.right = n3;
        n3.right = n4;*/
        BSTWithoutLeftChild obj = new BSTWithoutLeftChild();

       obj.print(n1);
    }
}
