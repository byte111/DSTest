package com.ds1;

/**
 * Created by dbhattac on 3/5/2017.
 */

class Node
{
    Node left,roght;
    int data;

    Node(int data)
    {
        this.data= data;
    }
}
public class LevelOrderTraversal {

    Node root;
    public void printGivenLevel(Node root,int level)
    {
        if(root == null)
            return;
        if(level ==1 )
            System.out.print(root.data);
        else if(level > 1)
        {
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.roght,level-1);
        }
    }

    public int  height(Node root)
    {
        if(root == null)
            return 0;

        int leftheight = height(root.left);
        int rightheight = height(root.roght);
        if(leftheight > rightheight)
            return leftheight+1;
        else
            return rightheight+1;

    }

    public void printlevel(Node root)
    {
        for(int i = 1 ; i <= height(root) ; i++ )
        {
            printGivenLevel(root,i);
        }
    }


}
