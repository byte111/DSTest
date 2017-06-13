package com.ds4;

/**
 * Created by dbhattac on 4/10/2017.
 */


public class VerticalOrder {
    class Node
    {
        int data;
        Node left,right;
    }
    class Values
    {
        int min,max;
    }

    Values val = new Values();
    public void findminmax(Node root,Values min,Values max, int hd)
    {
        if(root == null)
            return;
        if(hd < min.min)
            min.min = hd;
        if(hd > max.max)
            max.max = hd;
        findminmax(root,min,max,hd-1);
        findminmax(root,min,max,hd+1);
    }

    public void printgivenlevel(Node root,int lno,int hd)
    {
        if(root == null)
            return;
        if(lno == hd)
            System.out.print(root.data + " ");
        printgivenlevel(root,lno,hd-1);
        printgivenlevel(root,lno,hd+1);
    }

    public void verticalorder(Node root)
    {
        findminmax(root,val,val,0);
        for(int lno = val.min ; lno < val.max ;lno++)
        {
            printgivenlevel(root,lno,0);
            System.out.println();
        }
    }

    public static void main(String a[])
    {

    }
}
