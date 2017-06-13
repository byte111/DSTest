package com.ds;

/**
 * Created by dbhattac on 2/13/2017.
 */

// this one really works man !!!


public class StringBomber1 {
    public static void main(String args[])
    {
        String input  = "abbcccadag";
        String output = "";
        char prevchar = input.charAt(0);
        for(int i  = 0 ; i < input.length()   ; )
        {

            char outputlastchar = ' ';
            if(output.length() > 0)
            {
             outputlastchar =  output.charAt(output.length()-1);
            }

            if( i == input.length() -1 )
            {
                if(outputlastchar != input.charAt(i))
                {
                    output +=input.charAt(i);
                }
                else
                {
                    if(output.length() > 0)
                    {
                        output = output.substring(0,output.length()-1);
                    }
                }
                break;
            }

            if((input.charAt(i) == input.charAt(i+1)) )
            {
                int j = i;

                while(j< input.length() && input.charAt(j) == input.charAt(i))
                {
                    j++;
                }
                i=j;
                prevchar = input.charAt(j-1);
            }
            else if(   input.charAt(i) == outputlastchar )
            {

                if(output.length() > 0)
                {
                     output = output.substring(0,output.length()-1);
                }

                prevchar = input.charAt(i);
                i++;

            }
            else
            {
                output +=input.charAt(i);
                prevchar = input.charAt(i);
                i++;

            }

        }

        System.out.println("output:"+output);
    }
}
