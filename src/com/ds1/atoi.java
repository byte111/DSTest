package com.ds1;

/**
 * Created by dbhattac on 3/12/2017.
 */
public class atoi {

    public int convertInt(String num)
    {
       int  no = 0;
        int j=0;
        boolean numstarted = false,isneg = false;

        for(int i =0; i <num.length(); i++)
        {
            if(num.charAt(i) == ' ' || (numstarted && (num.charAt(i) == '-' || num.charAt(i) == '+' )))
            {
                if(!numstarted) {
                    continue;
                }
                else
                {
                    break;
                }
            }
            else {
                if(!numstarted)
                {
                    if(num.charAt(i) == '-')
                    {
                        isneg = true;
                        numstarted = true;
                        continue;
                    }
                    else if(num.charAt(i) == '+')
                    {
                        numstarted = true;
                        continue;
                    }
                }

                int temp = (int) num.charAt(i);

                if(temp >=48 && temp<=57) {
                    no = (no * 10) + (int) num.charAt(i) - 48;
                }
                else
                {
                    break;
                }
            }
        }
        if(isneg)
        {
            no = -no;

        }
        else if(!isneg && no < 0)
        {
            no = 0 - no;
        }
        return  no;
    }

    public static void main(String args[])
    {
       System.out.print(new atoi().convertInt("2147483648"));

    }
}
