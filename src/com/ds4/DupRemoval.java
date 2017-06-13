package com.ds4;

/**
 * Created by dbhattac on 4/6/2017.
 */
class LLNode
{
    int data;
    LLNode next;
    LLNode(int data)
    {
        this.data =data;
    }
    public boolean equals(Object o)
    {
        LLNode t = (LLNode)o;
        if(t.data == this.data) return true;
        return false;
    }
}
public class DupRemoval {

    LLNode start;
    public void removal(LLNode start)
    {
        LLNode t1 = start , t2 , prev = start;
        while(t1!=null)
        {
            t2 = start;
            while(t2!=null)
            {
                if(t1.equals(t2) && t1!=t2)
                {
                    prev.next = t2.next;
                    prev = t1;
                }
                else {
                    prev = t2;
                }
                t2 = t2.next;
            }
            t1=t1.next;
        }
    }

    public void print(LLNode start)
    {
        while(start!=null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[])
    {
        LLNode n1 = new LLNode(1);
        LLNode n2 = new LLNode(2);
        n1.next = n2;
        LLNode n3 = new LLNode(3);
        n2.next = n3;
        LLNode n4 = new LLNode(4);
        n3.next = n4;

        DupRemoval obj = new DupRemoval();
        obj.print(n1);
        System.out.println();
        obj.removal(n1);
        obj.print(n1);

    }
}
