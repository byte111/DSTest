package com.ds1;

/**
 * Created by dbhattac on 3/18/2017.
 */
public class TreeNodeInsert {


 public static Node insert(Node start,int key)
    {
        if(start == null)
        {
            return new Node(key);
        }




        if( key <= start.data) {
           start.left =  insert(start.left, key);

        }
        else if(key  > start.data)
        {
          start.roght =    insert(start.roght,key);
        }
        return  start;
    }

  public static Node delete(Node start,int key)
    {
        if(start == null)
        {
            return start;
        }

        if(key < start.data)
         start.left =  delete(start.left,key);
        else if(key > start.data)
           start.roght =  delete(start.roght,key);
        else
        {
            if(start.left == null && start.roght == null)
                start = null;

            else if(start.left == null)
                start = start.roght;
            else if(start.roght == null)
                start = start.left;
            else
            {
                Node min = findmin(start.roght);
                min.left = start.left;
                start = start.roght;
            }



        }
        return start;
    }

    public static Node findmin(Node root)
    {
        if(root!= null && root.left == null)
            return root;
       return findmin(root.left);
    }
    public static void inorder(Node root)
    {
        if(root == null)
            return;


        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.roght);

    }

    public static void main(String args[])
    {
        Node n1 = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(14);


        n1.left = n2;
        n1.roght = n4;
        n2.roght = n3;

        System.out.println("Initial tree ");
        TreeNodeInsert.inorder(n1);
        TreeNodeInsert.insert(n1,15);
        System.out.println("Adding 15 in  tree ");
        TreeNodeInsert.inorder(n1);
        Node n = TreeNodeInsert.delete(n1,6);
        System.out.println("Deleting 10 in  tree ");
        TreeNodeInsert.inorder(n);


    }
}
