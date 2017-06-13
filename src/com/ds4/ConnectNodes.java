package com.ds4;

/**
 * Created by dbhattac on 4/6/2017.
 */
class TNode
{
    int data;
    TNode left,right;
    TNode(int data)
    {
        this.data=data;
    }
}
class LNode
{
    int data;
    LNode next;
    LNode(int data){
        this.data=data;
    }
}

class QNode
{
    int level;
    LNode front,rear;
    QNode(LNode front,LNode rear,int level)
    {
        this.front = front;
        this.rear = rear;
        this.level = level;
    }

    public void enqueue( LNode node)
    {

    }
}

public class ConnectNodes {
    QNode queue;
    TNode root;

    public void traverse(TNode root)
    {
        for(int i =0 ;i < height(root) ; i++)
        {

        }
    }

    public void levelorder(TNode treenode,int level,QNode qnode,int origlevel)
    {
        if(level == 0)
        {
            if(qnode == null)
            {
                LNode t = new LNode(treenode.data);
               // qnode = new QNode(t,origlevel);
            }
            else
            {

            }
        }

    }

    public int height(TNode root)
    {
        if(root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);

        return lheight > rheight ? lheight +1 : rheight +1 ;
    }

}
