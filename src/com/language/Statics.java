package com.language;

/**
 * Created by dbhattac on 4/20/2017.
 */
public class Statics {

    static class TT1
    {
        static public void print()
        {
            System.out.print("In TT1");
        }
    }
    static class TT2 extends TT1
    {
        static public void print()
        {
            System.out.print("In TT2");
        }
    }

    public static void main(String args[])
    {
        Statics.TT1 obj = new Statics.TT2();
        obj.print();
    }
}
