package com.ds;

/**
 * Created by dbhattac on 2/10/2017.
 */
public class Test22
{
    public static void main(String args[])
    {
        try {
            String input = "aabcccdee";
            String output = "";
            char prevchar = ' ';
            for (int i = 0; i < input.length(); i++) {
                if (prevchar != input.charAt(i)) {
                    output = output + input.charAt(i);
                    prevchar = input.charAt(i);
                } else {

                    if (output.length() > 0) {
                        output = output.substring(0, output.length() - 1);

                        if (output.length() > 0) {
                            prevchar = output.charAt(output.length() - 1);
                        } else {
                            prevchar = ' ';
                        }
                    } else {
                        output = "";
                        prevchar = ' ';
                    }
                    //System.out.print(output);

                }

            }
            System.out.print(output);
        }

   catch(Exception e)
            {
//just ignore now
            }

        }


    }