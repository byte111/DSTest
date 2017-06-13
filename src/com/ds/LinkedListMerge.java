package com.ds;

/**
 * Created by dbhattac on 2/28/2017.
 */
class N
{
    int data;
    N next;
    N(){}
    N(int data)
    {
        this.data = data;
    }
}
public class LinkedListMerge {
    public N llmerge(N head1,N head2) {
        N temph1 = head1, temph2 = head2;
        N mergedlisthead = null;
        while (temph1 != null && temph2 != null) {
            if (temph1.data <= temph2.data) {
                if (mergedlisthead == null) {
                    mergedlisthead = new N();
                    mergedlisthead.data = temph1.data;
                } else {
                    N temp = mergedlisthead;
                    while (temp.next != null) {
                        temp = temp.next;
                    }

                    N newnode = new N();
                    newnode.data = temph1.data;
                    temp.next = newnode;
                }
                temph1 = temph1.next;
            } else {
                if (mergedlisthead == null) {
                    mergedlisthead = new N();
                    mergedlisthead.data = temph2.data;
                } else {
                    N temp = mergedlisthead;
                    while (temp.next != null) {
                        temp = temp.next;
                    }

                    N newnode = new N();
                    newnode.data = temph2.data;
                    temp.next = newnode;
                }
                temph2 = temph2.next;
            }
        }

        if (temph1 != null) {
            while (temph1 != null) {
                if (mergedlisthead == null) {
                    mergedlisthead = new N();
                    mergedlisthead.data = temph1.data;
                } else {
                    N temp = mergedlisthead;
                    while (temp.next != null) {
                        temp = temp.next;
                    }

                    N newnode = new N();
                    newnode.data = temph1.data;
                    temp.next = newnode;
                }
                temph1 = temph1.next;
            }
        }


        if (temph2 != null) {
            while (temph2 != null) {
                if (mergedlisthead == null) {
                    mergedlisthead = new N();
                    mergedlisthead.data = temph2.data;
                } else {
                    N temp = mergedlisthead;
                    while (temp.next != null) {
                        temp = temp.next;
                    }

                    N newnode = new N();
                    newnode.data = temph2.data;
                    temp.next = newnode;
                }
                temph2 = temph2.next;
            }

        }


        return mergedlisthead;
    }

    public void print(N head)
    {
        while(head!=null)
        {
            System.out.print(head.data);
            head = head.next;
        }
    }
    public static void main(String args[])
    {
        N n11 = new N(0);
        N n12 = new N(2);
        n11.next = n12;
        N n13 = new N(4);
        n12.next = n13;
        N n14 = new N(6);
        n13.next = n14;
        N n15 = new N(8);
        n14.next = n15;

        N n21 = new N(1);
        N n22 = new N(3);
        n21.next = n22;
        N n23 = new N(5);
        n22.next = n23;
        N n24 = new N(7);
        n23.next = n24;
        N n25 = new N(9);
        n24.next = n25;


        LinkedListMerge ll  = new LinkedListMerge();
       N mergedhead =  ll.llmerge(n11,n21);
        ll.print(mergedhead);
    }

}
