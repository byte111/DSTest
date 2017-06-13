package com.ds6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dbhattac on 5/13/2017.
 */
class TreeNode
{
    TreeNode left,right;
    int data;
    public TreeNode(int data)
    {
        this.data = data;
    }
}
public class Traversal {
    static void levelOrder(TreeNode root)
    {
        if(root==null) return;
        List<List<Integer>> num = new ArrayList();
        for(int i = 0 ;i < height(root) ; i++)
        {
            ArrayList temp = new ArrayList();
            printGivelLevel(root,i,i,temp);
            if(temp.size() > 0)
                num.add(temp);
            System.out.println();
        }
            System.out.print("Array= " + num);

    }
    static void printGivelLevel(TreeNode root,int i ,int k , ArrayList temp )
    {
        if(root == null) return;
        if(i==0) {
            System.out.print(root.data + " ");
            temp.add(root.data);
        }
        if(k%2==0){
            printGivelLevel(root.left,i-1,k,temp);
            printGivelLevel(root.right,i-1,k,temp);
        }
        else
        {
            printGivelLevel(root.right,i-1,k,temp);
            printGivelLevel(root.left,i-1,k,temp);
        }
    }

    static int height(TreeNode root)
    {
        if (root == null ) return 0;
        int leftheight = height(root.left);
        int rightheight  = height(root.right);
        if(leftheight > rightheight) return leftheight+1;
        else
            return rightheight+1;
    }

    public static void main(String args[])
    {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        Traversal.levelOrder(n1);
    }
}
