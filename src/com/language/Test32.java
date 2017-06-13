package com.language;

/**
 * Created by dbhattac on 4/20/2017.
 */
public class Test32 {

int aaa;
    static int ccc;
    class C
    {
        void m1() {
            new Test32().aaa=1;
        }
    }
      static class A
    {
         int a;
        void m1() {
            new Test32().aaa=1;
        }

    }
    static class B extends A
    {

    }

    public static void main(String args[])
    {
        Test32.B obj1 = new B();
        System.out.print(obj1.a);
    }
}

abstract class  t1234
        {
            void hello(){};
        }