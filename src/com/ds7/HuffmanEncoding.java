package com.ds7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dbhattac on 6/11/2017.
 */

class HuffNode
{
    String nodename;
    int value;
    HuffNode left,right;
    public HuffNode(String nodename,int value)
    {
        this.nodename = nodename;
        this.value = value;
    }
}
public class HuffmanEncoding {
    static List<HuffNode> nodes = new ArrayList<>();
    static HuffNode firstmin = new HuffNode("",Integer.MIN_VALUE),
                    secondmin = new HuffNode("",Integer.MAX_VALUE);

    static void findMin()
    {
        firstmin =  nodes.get(0);
        secondmin = new HuffNode("",Integer.MAX_VALUE);
        for(Iterator it = nodes.iterator();it.hasNext();)
        {
            HuffNode temp = (HuffNode)it.next();
            if(temp.value < firstmin.value)
            {
                firstmin = temp;
             //   continue;
            }

            if(temp.value > firstmin.value && temp.value < secondmin.value)
            {
                secondmin = temp;
            }
        }
    }

    static HuffNode coding()
    {
        int count = 1 ;
        HuffNode temp = null;
        while (nodes.size() > 1)
        {
            findMin();
            temp = new HuffNode("N"+count , firstmin.value + secondmin.value);
            nodes.remove(firstmin);
            nodes.remove(secondmin);

            temp.left = firstmin;
            temp.right = secondmin;
            nodes.add(temp);
            count++;
        }
        return temp;
    }

    static void traverse(HuffNode root,String path)
    {
        if(root == null)
            return;
        String temppath = path;
        traverse(root.left,path+"0");
        path = temppath;
        if(root!=null && root.left == null && root.right == null)
        System.out.println(root.value + " ==> " + path);
        temppath = path;
        traverse(root.right,path+"1");
        path = temppath;
    }

    public static void main(String args[])
    {
        HuffNode A = new HuffNode("A",5);
        HuffNode B = new HuffNode("B",9);
        HuffNode C = new HuffNode("C",12);
        HuffNode D = new HuffNode("D",13);
        HuffNode E = new HuffNode("E",16);
        HuffNode F = new HuffNode("F",45);
        nodes.add(A);
        nodes.add(B);
        nodes.add(C);
        nodes.add(D);
        nodes.add(E);
        nodes.add(F);

        HuffmanEncoding.traverse(HuffmanEncoding.coding(),"");

    }
}


