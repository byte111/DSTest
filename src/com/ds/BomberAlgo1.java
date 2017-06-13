package com.ds;

/**
 * Created by dbhattac on 2/11/2017.
 */
public class BomberAlgo1 {

    public static void main(String args[])
    {
        String input = "abbccc";
        String output=input.charAt(0)+"";
        char prevchar ;

        for(int i = 1 ; i < input.length() ; )
        {
            int j =-1;
            if((input.charAt(i) == input.charAt(i-1)) || (output.charAt(output.length()-1)) == input.charAt(i))
            {
                for(j = i+1; j < input.length();j++)
                {
                    if(input.charAt(j)==input.charAt(i))
                    {
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }

                output = output.substring(0,i-2);
                prevchar = output.charAt(output.length()-1);
            }
            else
            {
                output+=input.charAt(i);
                prevchar = input.charAt(i);
            }

            if(j==-1)
            {
                i++;
            }
            else
            {
                i=j;
            }
        }
        System.out.print(output);
    }
}
