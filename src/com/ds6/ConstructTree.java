package com.ds6;

import com.ds.TreeNode;

/**
 * Created by dbhattac on 5/13/2017.
 */
public class ConstructTree {

    static TreeNode constructTree(int inorder[],int preorder[],int inorderstart,int inorderend)
    {
        if(inorder.length == 0 || preorder.length == 0 || inorder.length!=preorder.length || inorderstart == -1 || inorderend == -1) return null;
        if(inorderstart < inorderend)
        {
            for(int i  = inorderstart ; i <=inorderend ; i++)
            {
                for(int j  = inorderstart ; j <=inorderend ; j++)
                {
                    if(inorder[i] == preorder[j])
                    {
                        int mid = (inorderstart+inorderend)/2;
                        TreeNode n = new TreeNode(inorder[mid]);
                        n.left = constructTree(inorder,preorder,inorderstart,mid-1);
                        n.right = constructTree(inorder,preorder,mid+1,inorderend);
                        return n;
                    }

                }
            }
            return  null;
        }
        else
        {
            return new TreeNode(inorder[inorderend]);
        }
    }

    static void print(TreeNode n)
    {
        if(n == null)
            return;

        System.out.print(n.data + " , ");
        print(n.left);
        print(n.right);
    }

    public static void main(String args[])
    {
        int preorder[] = {2,1};
        int inorder[] = {1,2};
        TreeNode n = ConstructTree.constructTree(inorder,preorder,0,inorder.length-1);
        ConstructTree.print(n);
    }
}
