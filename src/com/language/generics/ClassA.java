package com.language.generics;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class ClassA<E> implements  interaceA<E> {


    static  class B
    {
        Object o= new Object();

    }

    class C
    {}
    @Override
    public void print() {
        System.out.print("Hello World !! ");
    }

    public static void main(String args[])
    {
        interaceA<Number> intf = new ClassA<Number>();
        ClassA<Integer> obj = new ClassA<Integer>();
        ClassA<Number> obj1 = new ClassA<Number>();
        //obj = obj1;
        ClassA.B obj2 = new ClassA.B();
        ClassA.C obj3 =  new ClassA().new C();
    }
}



