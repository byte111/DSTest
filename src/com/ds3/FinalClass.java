package com.ds3;

/**
 * Created by dbhattac on 3/29/2017.
 */
public final class FinalClass {

    int a;

    public void setA(int a)
    {
        this.a = a;
    }

    public int getA()
    {
      return a;
    }

    public static void main(String args[])
    {
        FinalClass o = new FinalClass();
        o = new FinalClass();

        o.setA(1);
        System.out.print(o.getA());
    }

}
