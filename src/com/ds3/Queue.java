package com.ds3;

/**
 * Created by dbhattac on 3/26/2017.
 */
public class Queue
{

    private Node  node;
    private Queue next;

    Queue(Node data)
    {
        this.node = data;
    }

}

class Queueoperations
{
    Queue queue;
    public void enqueue(Node data)
    {
        if(queue == null)
        {
            queue  = new Queue(data);
        }
        else
        {

        }

    }
}