package com.ds6;

import com.ds.*;

/**
 * Created by dbhattac on 5/14/2017.
 */
class Values{int min,max;}
public class VertocalOrderTraversal {
public void findminmax(TreeNode root ,Values min,Values max, int hd)
{
    if(root == null) return;
    if(hd < min.min) min.min = hd;
    if(hd  > max.max) max.max = hd;
    findminmax(root.left,min,max,hd-1);
    findminmax(root.right,min,max,hd+1);
}
public void verticalLine(TreeNode root)
{
    Values val= new Values();
    findminmax(root,val,val,0);
    for(int lno = val.min; lno<=val.max;lno++)
    {
        printGivenLevel(root,lno,0);
        System.out.println();
    }
}
public void printGivenLevel(TreeNode node,int lno,int hd)
{
    if(node == null) return;
    if(lno == hd) {
        System.out.print(" lno= " + lno + "  data=" +node.data + " ");
        return;
    }
    printGivenLevel(node.left,lno,hd-1);
    printGivenLevel(node.right,lno,hd+1);
}

public static void main(String args[])
{
    TreeNode t8 = new TreeNode(8);
    TreeNode t4 = new TreeNode(4);
    TreeNode t2 = new TreeNode(2);
    TreeNode t5 = new TreeNode(5);
    TreeNode t6 = new TreeNode(6);
    TreeNode t10 = new TreeNode(10);
    TreeNode t9= new TreeNode(9);
    TreeNode t12 = new TreeNode(12);
    t8.left = t4;
    t8.right = t10;
    t4.left = t2;
    t4.right = t5;
    t5.right = t6;
    t10.left = t9;
    t10.right = t12;

    VertocalOrderTraversal obj = new VertocalOrderTraversal();
    obj.verticalLine(t8);

}
}
