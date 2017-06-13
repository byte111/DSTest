package com.ds;

/**
 * Created by dbhattac on 2/28/2017.
 */

class N1
{
    N1 left,right;
    int data;

    N1(int data)
    {
        this.data = data;
    }
}
public class BTChildrenSum {
    public N1 sum(N1 head)
    {
        if(head == null)
        {
            return head;
        }

        N1 leftchild = sum(head.left);
        N1 rightchild = sum(head.right);
        if(leftchild!= null ) {
            head.data = leftchild.data;
        }
        if(rightchild!=null)
        {
            head.data = head.data  +rightchild.data;
        }
        return head;
    }

    public  void print(N1 n)
    {
        if(n== null)
            return;
        System.out.print(n.data + " , ");
        print(n.left);
        print(n.right);

    }

    public static void main(String args[])
    {
        N1 n1 = new N1(10);
        N1 n2 = new N1(5);
        N1 n3 = new N1(8);
        N1 n4 = new N1(4);
        N1 n5 = new N1(14);
        n1.left = n2;
        n1.right = n5;
        n2.left = n4;
        n2.right = n3;

        BTChildrenSum obj = new BTChildrenSum();
       N1 head = obj.sum(n1);
        obj.print(head);
//System.out.print(head);



    }
}
