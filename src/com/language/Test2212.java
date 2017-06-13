package com.language;

import java.util.Locale;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class Test2212 {
    public static void main(String args[]) throws Exception
    {
       // System.out.println(Locale.getDefault());
        A a = new A();
        A b = a.clone();
        System.out.println( "a="+a.c.k);
        System.out.println( "b="+b.c.k);

      /*  C org = a.c;
        C copy = b.c.clone();
        copy.k = 8;*/
b.c.k= 8;
            System.out.println( "a="+a.c.k);
        System.out.println( "b="+b.c.k);
    }
}

class A implements  Cloneable
{
    int i = 6;
    String test = "hello";
    C c = new C();
    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }


}

class C  implements Cloneable
{
    int k = 7;
    @Override
    protected C clone() throws CloneNotSupportedException {
        return (C) super.clone();
    }
}