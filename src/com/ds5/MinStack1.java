package com.ds5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by dbhattac on 4/23/2017.
 */
public class MinStack1 {
    /*

       class Node
        {
            Node next,prev;
            int data;
            Node prevminnode;
            int minindex;
            Node(int data,int minindex)
            {
                this.data=data;
                this.minindex = minindex;
            }
        }

        Node head;
        ArrayList<Node> minimumnodes = new ArrayList<>();



        public void push(int x) {
            if(head ==null)
            {
                head = new Node(x,0);
               minimumnodes.add(head);
            }
            else
            {

                Node t = head;
                head.next = new Node(x);

                head = head.next;
                head.prev = t;


                    if (minimumnodes.get(minimumnodes.size()-1).data > x) {

                        minimumnodes.add(head);
                    }
                    else
                    {

                    }


            }
        }
        public void pop() {

            if(head!= null && head.prev == null )
            {
                head = minimum = null;
            }
            if(head!=null && head.prev != null)
            {
                Node t3 = head;
                head = head.prev;
                if(t3 == minimum) {

                    minimum = minimum.prevminnode;
                }

                head.next = null;
            }
        }

        public int top() {
            if(head == null)
                return -1;
            return head.data;
        }

        public int getMin() {

            return (minimum!=null ? minimum.data : -1);
        }
    */

    public static void main(String args[])
    {
       /* MinStack1 obj = new MinStack1();


        obj.push(85);
        obj.push(-99);
        obj.push(67);

        System.out.print("getMin=" + obj.getMin());
        obj.push(-27);
        obj.push(61);
        obj.push(-97);
        obj.push(-27);
        obj.push(35);
        System.out.print("top=" + obj.top());
        obj.push(-89);*/
    }
}
