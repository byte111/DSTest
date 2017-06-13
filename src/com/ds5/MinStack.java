package com.ds5;

/**
 * Created by dbhattac on 4/22/2017.
 */
public class MinStack {
    class Node
    {
        Node next;
        int data;
        Node(int n ) {
            this.data = n;
        }

    }
    Node start;
    Node minimum;
    public MinStack() {

    }

    public void push(int x) {
        if(start ==null) {
            start = new Node(x);
            minimum = start;
        }
        else
        {
            Node temp = start;
            while(temp.next!=null)temp=temp.next;

                temp.next = new Node(x);
            if(minimum.data > x) {
                minimum = temp.next;
            }
        }
    }

    public void pop() {
        Node temp = start,prev=start;
        if(start.next==null)
        {
            if(start == minimum)
                minimum = null;
            start = null;

            return;
        }
        while(temp !=null && temp.next!=null )
        {
            prev = temp;
            temp=temp.next;
        }

        if(minimum == prev.next)
            minimum = null;
        prev.next=null;

        if(minimum == null)
        {
            Node t = start;
            minimum = start;
            while(temp.next!=null)
            {
                if(minimum.data > temp.data)
                    minimum = temp;
            }
        }
    }

    public int top() {

            Node temp = start;
            while (temp != null && temp.next != null)
                temp = temp.next;

        if(start!=null)
            return  temp.data;

            return 0;
    }

    public int getMin() {
        if(minimum!=null)
        return minimum.data;
        return 0;
    }

    public static void main(String args[])
    {
       MinStack obj = new MinStack();


        obj.push(1);

        obj.pop();
         int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.print(param_3 + " , " + param_4);
    }
}


