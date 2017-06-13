package com.ds;

/**
 * Created by dbhattac on 2/25/2017.
 */
public class SearchTree {

    boolean found = false;
    public void search(Node2 start,int key)
    {
        if(start == null)
        {
            return ;
        }
        else if ( start.data == key)
        {
            found = true;
            return ;
        }
        else
        {
            if(key > start.data)
            {
                search(start.right,key);
            }
            else
            {
                search(start.left,key);
            }
        }
    }

    public static void main(String args[])
    {
        SearchTree obj = new SearchTree();
        Node2 n1= new Node2(10);
        Node2 n2= new Node2(15);
        Node2 n3= new Node2(6);
        Node2 n4= new Node2(8);
        Node2 n5= new Node2(4);

        n1.left = n3;
        n1.right = n2;
        n3.left = n5;
        n3.right = n4;

        int key  = 8;

        obj.search(n1,key);

        System.out.print( key + " is present ? " + obj.found);
    }

}
