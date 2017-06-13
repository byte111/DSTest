
package com.language;

/**
 * Created by dbhattac on 4/19/2017.
 */
public class Test22 {
    public static void main(String args[])
    {
        AAA a = new AAA();

    }
}

class AAA extends BBB
{
    {
        System.out.print("AAA instance block ");
    }

    static
    {
        System.out.print("AAA static block ");
    }

    AAA()
    {
        System.out.print("AAA constructor block ");
    }
}

class BBB
{
    {
        System.out.print("BBB instance block ");
    }

    static
    {
        System.out.print("BBB static block ");
    }

    BBB()
    {
        System.out.print("BBB constructor block ");
    }
}
