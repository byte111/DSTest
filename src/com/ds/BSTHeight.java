package com.ds;


/**
 * Created by dbhattac on 3/1/2017.
 */
public class BSTHeight {

    TreeNode root;

    public int calcHeight(TreeNode root)
    {
        if(root == null)
        {
            return  0;
        }

        int leftheight = calcHeight(root.left);
        int righhroght = calcHeight(root.right);

        if(leftheight > righhroght)
        {
            return leftheight+1;
        }
        else
            return righhroght+1;
    }

    public static void main(String args[]) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(14);
        TreeNode n6 = new TreeNode(13);
        TreeNode n7 = new TreeNode(2);
        n1.left = n2;
        n1.right = n5;
        n2.left = n4;
        n2.right = n3;
        n5.left = n6;
        n4.left = n7;
        BSTHeight obj = new BSTHeight();

        System.out.print(obj.calcHeight(n1));
    }
}
