package com.ds5;

/**
 * Created by dbhattac on 4/21/2017.
 */
public class RecurringDiv {

    static void division(int numer , int denom)
    {
        int rem =-1;
        String result="";
        while (rem != 0 && ( rem != (numer > denom ?  ( numer - denom) : numer)))
        {
            int tempnumer = numer,division=0;
            if(rem>-1)
                tempnumer = rem;
            while(tempnumer < denom)
            {
                tempnumer*=10;
            }
            while (tempnumer>=denom)
            {
                tempnumer-=denom;
                division+=1;
            }
            rem = tempnumer;
            result+=division;
            if(rem !=0 && numer <denom)
                result="0."+result;
            else if(rem !=0 && numer > denom)
                result+=".";
            else if(rem == 0 && numer < denom)
                result="0."+result;
        }

        if(rem == 0 )
            System.out.print(result);
        else if(rem == numer || rem == (denom - numer))
            System.out.print(result.substring(0,result.indexOf("."))+".("+result.substring(result.indexOf(".")+1)+")");

    }

    public static void main(String args[])
    {
        RecurringDiv.division(4,3);
    }
}
