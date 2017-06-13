package com.ds6;

/**
 * Created by dbhattac on 4/27/2017.
 */

  class ListNode {
  int val;
   ListNode next;
 ListNode(int x) { val = x; }
 }
public class DeleteNode {

    public ListNode removeNthFromEnd1(ListNode start, int i) {

        if(i <= 0)
            return null;
        ListNode head= start;
        if(start == null)
            return null;
        ListNode p1 = start, p2 = start;
        int count = 0;
        while(p2!=null&& count < i)
        {
            p2=p2.next;
            count++;
        }
        if(count< i)
            return null;

        while(p2!=null && p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next;
            count++;
        }

        if(count==i)
        {
            head = head.next;
            return head;
        }
        ListNode t = p1.next;
        p1.next= t.next;
        return head;
    }

    public void print(ListNode temp)
    {
        while(temp!=null) {
            System.out.print(temp.val + " ,");
            temp=temp.next;
        }
        System.out.println();
    }



    public ListNode removeNthFromEnd(ListNode start, int i) {

        if(i <= 0)
            return null;
        ListNode head= start;
        if(start == null)
            return null;
        ListNode p1 = start, p2 = start,prev = start;
        int count = 1;
        while(count < i && p2!=null && p2.next!=null)
        {
            p2=p2.next;
            count++;
        }
        if(count != i || p2 == null)
            return null;

        while(p2.next!=null)
        {
            prev = p1;
            p1=p1.next;
            p2=p2.next;

        }

        if(prev == p1)
        {
            head = head.next;
            return head;
        }

        prev.next = p1.next;

        return head;
    }


    public static void main(String args[])
    {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        com.ds6.DeleteNode obj = new com.ds6.DeleteNode();
        System.out.println("before removal");
        obj.print(n1);
        ListNode temp = obj.removeNthFromEnd(n1,4);
        System.out.println("after removal");
        obj.print(temp);
    }
}
