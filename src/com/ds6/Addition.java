package com.ds6;

/**
 * Created by dbhattac on 5/3/2017.
 */

/*

Caution : Works well with positive numbers. If you try  negative numbers, may the God save you from inifinte loop...
 */
public class Addition {
    public static void main(String args[])
    {
        int x = 13;
        int y =  02;
        int sum = 0;
        int carry = 0;
        int t = 0;
        int i = 0;
        while(x > 0 || y >0  || carry > 0 )
        {


         int xlastdig = x&1;
         int ylastdig = y&1;


          int lastdigsum = xlastdig ^ ylastdig ;
            t =   carry ^ lastdigsum ;
            sum = sum  | (t<<i) ;
            x = x >>1;
            y = y >> 1;
            if( xlastdig ==1 && ylastdig ==1) {
                carry = 1;
            }
            else if(carry == 1 && lastdigsum == 1)
                carry = 1;
            else
                carry =0;
            i++;
        }

        System.out.print(sum);
    }
}
