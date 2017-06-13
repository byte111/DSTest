package com.ds;

/**
 * Created by dbhattac on 2/28/2017.
 */
public class StaticRef {
public static void main(String args[])
{
    Child c  = new Child();

}
}

class Parent
{
    static
    {
        System.out.println("This is from Parent");
    }
    Parent()
    {
        System.out.println("This is from Parent constructor");
    }
}

class Child extends Parent
{
    static int  i=10;
    static
    {
        System.out.println("This is from Child"+i);
    }
    Child()
    {
        System.out.println("This is from Child constructor");
    }
}