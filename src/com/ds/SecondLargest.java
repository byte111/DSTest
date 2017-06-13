package com.ds;

/**
 * Created by dbhattac on 2/25/2017.
 */

class Node2
        {
            Node2 left , right;
            int data;
            Node2(int data)
            {
                this.data = data;
            }
        }
public class SecondLargest
{
    Node2 root;
    int arr[] = new int[100];
    int count = 0;

    public void traverse(Node2 start)
    {
        if(start == null)
        {
            return;
        }

        traverse(start.left);
        arr[count++] = start.data;
        traverse(start.right);

    }

    public static void main(String args[])
    {
        SecondLargest obj = new SecondLargest();
        //creating a dummy tree here
        Node2 n1= new Node2(10);
        Node2 n2= new Node2(15);
        Node2 n3= new Node2(6);
        Node2 n4= new Node2(8);
        Node2 n5= new Node2(4);

        n1.left = n3;
        n1.right = n2;
        n3.left = n5;
        n3.right = n4;

        obj.traverse(n1);
        int k = 2;

        for(int  i = 0 ; i < obj.count; i ++)
        {
            System.out.print(obj.arr[i] + " ");
        }
       // System.out.print(obj.count);
        System.out.print(k + " largest = " +  obj.arr[obj.count-k]);
    }
}
