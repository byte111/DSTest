package com.ds;

/**
 * Created by dbhattac on 2/10/2017.
 */
public class CoinDenomination {

    public static void main(String args[])
    {
        int denom[] ={1,2,5,10};
        int amount = 127;
        int nocoins[]= new int[denom.length];
        int i =denom.length-1;
        for(;i>=0;i--)
        {
            if(amount<=0)
            {
                break;
            }
            nocoins[denom.length-i] = amount/denom[i];
            amount=amount%denom[i];
        }

        for(int j=0;j<=i;j++)
        {
            System.out.print(nocoins[j]);
        }

    }
}
