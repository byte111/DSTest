package com.ds;

/**
 * Created by dbhattac on 2/23/2017.
 */
public class LLPalindrome {

    Node head,tail;
    class Node
    {
        char val;
        Node next;
        Node prev;
    }

    public static void main(String args[])
    {
        LLPalindrome obj = new  LLPalindrome();

        LLPalindrome.Node node1 = new  LLPalindrome().new Node();
        LLPalindrome.Node node2 = new  LLPalindrome().new Node();
        LLPalindrome.Node node3 = new  LLPalindrome().new Node();
        LLPalindrome.Node node4 = new  LLPalindrome().new Node();
        LLPalindrome.Node node5 = new  LLPalindrome().new Node();

        node1.val = 'M';
        node1.next = node2;
        node1.prev = null;
        node2.val = 'A';
        node2.next = node3;
        node2.prev = node1;
        node3.val = 'D';
        node3.next = node4;
        node3.prev = node2;
        node4.val = 'A';
        node4.next = node5;
        node4.prev = node3;
        node5.val = 'M';
        node5.next = null;
        node5.prev = node4;

        obj.head = node1;
        obj.tail = node5;

        while(obj.head.next != null && obj.tail.prev != null)
        {
            if(obj.head.val == obj.tail.val)
            {
                obj.head = obj.head.next;
                obj.tail = obj.tail.prev;
                continue;
            }
            else
            {
                break;
            }
        }

        if(obj.head.next == null && obj.tail.prev == null)
        {
            System.out.print("palimdrome");
        }




    }
}
