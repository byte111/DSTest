package com.ds1;

/**
 * Created by dbhattac on 3/7/2017.
 */
public class DeleteNode
{
public Node deleteNode(Node root,int key)
{
    if(root == null)
        return null;


    if(key < root.data)
        root.left = deleteNode(root.left,key);
        else if(key > root.data)
            root.roght = deleteNode(root.roght,key);
    else
    {
        if(root.left == null)
            return root.roght;
        else if(root.roght == null)
            return root.left;
        else
        {
            Node n = fminNode(root.roght);
            root.data = n.data;
            root.roght = deleteNode(root.roght,n.data);
        }
    }

    return  root;

}

public Node fminNode(Node node)
{
    while(node.left !=null)
        node=node.left;
    return node;
}
public void inorder(Node root)
{
    if(root == null)
        return;
    System.out.print(root.data + " , ");
    inorder(root.left);
    inorder(root.roght);
}

public static void main(String args[])
{

    Node n1=  new Node(10);
    Node n2=  new Node(8);
    Node n3=  new Node(14);
    Node n4=  new Node(1);
    Node n5=  new Node(3);

    n1.left = n5;
    n1.roght = n3;
    n5.left = n4;
    n5.roght = n2;

DeleteNode obj = new DeleteNode();

    obj.deleteNode(n1,3);

    obj.inorder(n1);

}
}
