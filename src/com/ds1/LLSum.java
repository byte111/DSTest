package com.ds1;

/**
 * Created by dbhattac on 3/14/2017.
 */
public class LLSum {
    class LLNode
    {
        int data;
        LLNode next;
        LLNode(int data)
        {
            this.data=data;
        }
    }

    public LLNode sum(LLNode head1,LLNode head2)
    {
        LLNode temp1 = head1 , temp2 = head2;

        LLNode head3 = null;
        int l1 = 0 ,l2 = 0 ;
        while(temp1!=null &&temp2!=null)
        {
            temp1=temp1.next;
            l1++;
            temp2=temp2.next;
            l2++;
        }
        if(temp1!=null)
        {
            while (temp1!=null)
            {
                temp1=temp1.next;
                l1++;
            }
        }
        else
        {
            while (temp2!=null)
            {
                temp2=temp2.next;
                l2++;
            }
        }

        int carryover = 0;
        int ll1 = l1, ll2 = l2;
        while(ll1> 0 && ll2 > 0) {
            temp1 = head1;
            temp2 = head2;
            int templ1 = ll1, templ2 = ll2;

            while (templ1-- > 1) {
                temp1 = temp1.next;
            }
            while (templ2-- > 1) {
                temp2 = temp2.next;
            }

            int digsum = temp1.data + temp2.data + carryover;

            LLNode temp = null;
            if (digsum > 10) {
                temp = new LLNode(digsum % 10);
                carryover = 1;
            } else {
                temp = new LLNode(digsum);
            }

            if(head3 == null)
            {
                head3 = temp;
            }
            else
            {
                temp.next = head3;
                head3 = temp;
            }

            ll1--;
            ll2--;
        }

        temp1 = head1;
        temp2 = head2;
        if(l1 > l2)
        {
            int extranodes = l1 - l2;
            int templl = extranodes;
            while(extranodes  > 0 ) {


                while (templl-- > 1) {
                    temp1 = temp1.next;
                }

                LLNode t = null;
                int digsum = 0 ;
                if(carryover > 0)
                {
                    digsum = temp1.data + carryover;
                    if(digsum > 10)
                    {
                        t = new LLNode(digsum%10);
                        carryover = 1;
                    }
                    else
                    {
                        t = new LLNode(digsum);
                        carryover = 0;
                    }
                }


                if (head3 == null) {
                    head3 = t;
                } else {
                    t.next = head3;
                    head3 = t;
                }
                extranodes--;
            }

        }
        else
        {
            int extranodes = l2 - l1;
            int templ2 = extranodes;
            while(extranodes  > 0 ) {


                while (templ2-- > 1) {
                    temp2 = temp2.next;
                }

                LLNode t = null;

                int digsum = 0 ;
                if(carryover > 0)
                {
                    digsum = temp1.data + carryover;
                    if(digsum > 10)
                    {
                        t = new LLNode(digsum%10);
                        carryover = 1;
                    }
                    else
                    {
                        t = new LLNode(digsum);
                        carryover = 0;
                    }
                }

                if (head3 == null) {
                    head3 = t;
                } else {
                    t.next = head3;
                    head3 = t;
                }
                extranodes--;
            }
        }

        return head3;
    }

    public void print(LLNode head)
    {
        LLNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        LLSum obj = new LLSum();

    }
}
