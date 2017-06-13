package com.ds;

/**
 * Created by dbhattac on 2/11/2017.
 */
public class BomberAlgo {
    public static void main(String args[])
    {
        String input ="abbcccddddeeeee";
        char prevchar = input.charAt(0);
        String output=prevchar+"";
        for(int i = 1 ; i < input.length() ; i ++)
        {
            char charread = input.charAt(i);
            if(prevchar == charread)
            {
                char tempprevchar  = prevchar ;
                output = output.substring(0,output.length()-1);
                for(int j = i+1 ; j < input.length() ; j ++)
                {
                    if( j < input.length() && prevchar == input.charAt(j))
                    {
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }


            }
            else
            {
                output = output + input.charAt(i);
                prevchar = input.charAt(i);
            }
        }

        System.out.print(output);
    }
}
