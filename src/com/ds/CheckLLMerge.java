package com.ds;

/**
 * Created by dbhattac on 2/25/2017.
 */

class LLNode
{
    int data;
    LLNode next;

    LLNode(int data)
    {
        this.data = data;
    }

}
public class CheckLLMerge {


    public static void main(String args[])
    {
        LLNode root1 = null,root2=null;

        LLNode temp1,temp2;
        temp1 = root1;
        temp2 = root2;

        boolean merges = false;
        while(temp1 != null && temp2 != null)
        {

            if(temp1.next != null && temp2.next!= null && temp1.next == temp2.next) {
                merges = true;
                break;
            }

        }



    }

}
