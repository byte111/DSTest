package com.ds6;

import com.ds.TreeNode;

/**
 * Created by dbhattac on 5/6/2017.
 */
public class LCA {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }

    public static void main(String args[])
    {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(1);
        TreeNode t8 = new TreeNode(0);
        TreeNode t9 = new TreeNode(8);
        t1.left = t2;
        t1.right = t7;
        t2.left = t3;
        t2.right = t4;
        t4.left = t5;
        t4.right  = t6;
        t7.left = t8;
        t7.right = t9;
        System.out.print((LCA.lowestCommonAncestor(t1,t2,t6).data));
    }
}
