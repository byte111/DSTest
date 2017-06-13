package com.ds3;

/**
 * Created by dbhattac on 3/22/2017.
 */

class StackNode
{
    StackNode next;
    int data;
    StackNode(int data)
    {
        this.data = data;
    }
}
public class StackReversal
{
    StackNode root;
    int count;
    public void push(int data)
    {
        if(root == null)
            root = new StackNode(data);
        else
        {
            StackNode temp  = root;

            while( temp.next!=null)
                temp = temp.next;
            StackNode t = new StackNode(data);
            temp.next = t;

        }
        count++;
    }

    public int pop()
    {
        StackNode t = root,p=root;
        while(t!= null && t.next!=null) {
            p=t;
            t = t.next;
        }
        p.next = null;
        return t.data;
    }

    public void reverse()
    {
        StackNode temp = root,p=root,nxtnode=root;

        while(nxtnode!=null)
        {
            p = temp;
            temp = nxtnode;
            nxtnode = temp.next;
            temp.next = null;
            temp.next = p;

        }
    }

    public static void main(String args[])
    {
        StackReversal obj = new StackReversal();

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println (" Before reversing "+ obj.count);
        /*for(int i=0;i < obj.count;i++)
        {
           System.out.println(obj.pop());
        }
*/
        obj.reverse();
        System.out.println (" After reversing "+ obj.count);
        for(int i=0;i < obj.count;i++)
        {
            System.out.println(obj.pop());
        }

    }
}
