package com.ds3;

/**
 * Created by dbhattac on 3/28/2017.
 */

class QN
{
    int data;
    QN next;
    QN(int data)
    {
        this.data = data;
    }
}
public class Queues {
QN head,tail;

    public void enqueue(int d)
    {
        if(head == null)
        {
            head  = new QN(d);
            tail = head;
        }
        else
        {
            QN t = new QN(d);
            t.next = tail;
            tail = t;
        }
    }

    public int dequeue()
    {
        if(head == null)
        {
            return  -1;
        }
        else
        {
            QN t = tail;
            while(t.next!= head)
                t = t.next;
            int data = head.data;
            head = t;
            return data;
        }
    }

}
