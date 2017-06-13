package com.ds4;

/**
 * Created by dbhattac on 3/30/2017.
 */
public class LevelOrder {

    Node start;

    public void levelorder(Node start)
    {
        for(int i  = 0; i< height(start) ; i++)
        {
            printthislevel(start,i);
            System.out.println();
        }
    }

    public void printthislevel(Node start,int currlevel)
    {
        if(start == null)
            return;
        if(currlevel == 0)
        {
            System.out.print(start.data + " ");
            return;
        }

        printthislevel(start.left,currlevel-1);
        printthislevel(start.right,currlevel-1);

    }

    public int height(Node start)
    {
        if(start== null)
            return 0;

        int leftheight = height(start.left);
        int rightheight = height(start.right);

        return leftheight < rightheight ? leftheight+1 : rightheight + 1;
    }

    public static void main(String args[])
    {
        LevelOrder obj = new LevelOrder();
        Node n1= new Node(5);
        Node n2= new Node(2);
        Node n3= new Node(8);
        Node n4= new Node(1);
        Node n5= new Node(4);
        Node n6= new Node(6);
        Node n7= new Node(10);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        obj.levelorder(n1);
    }

}
