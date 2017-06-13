package com.language;

/**
 * Created by dbhattac on 4/22/2017.
 */
public class OOPs {
    public static void main(String args[])
    {
        A1 obj = new A1();
       // B1 obj1 =  (B1)new A1();
        System.out.print(obj instanceof  B1);
    }
}


class A1 {}
class B1 extends A1{}