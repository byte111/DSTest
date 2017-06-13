package com.language;

/**
 * Created by dbhattac on 4/20/2017.
 */
public class Test220 {

    public static void main(String args[])
    {
        try
        {
            int a=1/0;
        }

        finally
        {
            System.out.print("finally");
        }
    }
}
