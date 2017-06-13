package com.ds6;

/**
 * Created by dbhattac on 4/30/2017.
 */
public class QuickSortList {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    static void sort(Node head)
    {
        if(head == null)
            return;
        Node t1 = head , t2 = head , prev = head ;
        int count = 0 , len = 0;
        while(t1.next!=null)
        {
            t1 = t1.next;
            count++;
        }
        len = count;
        while (count>=0)
        {
            t2 = head ;
            prev = head ;
            boolean swapped = false;
            while(t2.next!=null && t2!=t1)
            {
                if(t2.data > t1.data)
                {
                    Node t3 = t2;
                    prev.next = t2.next;
                    t2 = t2.next;
                    t3.next = null;
                    Node t1temp = t1;
                    while(t1temp.next!=null)
                        t1temp=t1temp.next;
                    t1temp.next = t3;

                    swapped = true;

                }
                else {
                    prev = t2;
                    t2 = t2.next;
                }

            }

            Node t1temp = t1;

            if(!swapped)
            {
                int i = len - count;
                t1temp = head;
                while(t1temp.next!=null && i-- > 0)
                    t1temp=t1temp.next;
            }
            else
            {
                while(t1temp.next!=null)
                    t1temp=t1temp.next;
            }

            t1 = t1temp;
            count--;
        }

        print(head);
    }

    static void print(Node n)
    {
        if(n == null) return;
        while(n!=null)
        {
            System.out.print(n.data + " , ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        QuickSortList.Node n1 = new QuickSortList.Node(2);
        QuickSortList.Node n2 = new QuickSortList.Node(2);
        n1.next = n2;
        QuickSortList.Node n3 = new QuickSortList.Node(1);
        n2.next = n3;
        QuickSortList.Node n4 = new QuickSortList.Node(5);
        n3.next = n4;
        QuickSortList.Node n5 = new QuickSortList.Node(4);
        n4.next = n5;
        QuickSortList.Node n6 = new QuickSortList.Node(3);
        n5.next = n6;

      //  QuickSortList.print(n1);
        QuickSortList.sort(n1);
    }


}
