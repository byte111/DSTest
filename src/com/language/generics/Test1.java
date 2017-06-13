package com.language.generics;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class Test1 {

    public static void main(String args[])
    {
        Node node1 = new Node();
        node1.value = "hello";
        System.out.println(node1.value);
        Node node2 = new Node();
        node2.value = 45;
        System.out.println(node2.value);
    }
}


class Node<E>
{
    Node<E> next;
    Object value;
}