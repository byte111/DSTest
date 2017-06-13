package com.ds1;

/**
 * Created by dbhattac on 3/7/2017.
 */
public class Sum {

    public LLNode sum(LLNode node1,LLNode node2)
    {
        LLNode temp1 = node1 , temp2 = node2, sum = null, prevtemp = null;


        while(temp2!=null)
        {
            int n2 = temp2.data;
            while (temp1.next != null)
            {
                prevtemp = temp1;
                temp1 = temp1.next;
            }
            int n1 = temp1.data;
            prevtemp.next = null;

            LLNode temp = new LLNode(n1+n2);

            temp2 = temp2.next;
            if(sum==null)
            {
                sum = temp;
            }
            else
            {

                temp.next = sum;
                sum = temp;
            }

        }

        return sum;
    }
}
