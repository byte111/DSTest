package com.language;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dbhattac on 4/2/2017.
 */
public  class Test1 extends ParentClass
{
    public void m1(int i) throws IOException
    {
        System.out.print(i);
    }

    public long m1(int i,int j) throws IOException
    {
        System.out.print(i);
        return 0;
    }

    public static void main(String args[])
    {
        ParentClass obj = new ParentClass();
        ParentClass obj1 = new Test1();
        Test1 obj2 =  new Test1();

        //obj.m22();
        //obj1.m22();
        //obj2.m22();
   obj2.m23();
    }

    public  void m23()
    {
       // System.out.print("Test1");
        super.m22();
    }

}



class ParentClass
{
    public void m1(int i) throws IOException
    {
        System.out.print("parent");
    }




    public static void m22()
    {
        System.out.print("ParentClass");
    }
}

abstract class Parent
{
    int i;
    Parent()
    {
        i=5;
    }


}


class AAAAA
{
    AAAAA(int i )
    {
        System.out.print(i);
    }
}

class  BBBBBB extends AAAAA
{
    BBBBBB()
    {
       this(1);

    }

    BBBBBB(int i)
    {
        super(i);
        System.out.print(i);
    }
}

interface test
{
    class A
    {
        public static void main(String args[])
        {
            System.out.print("hello");
        }
    }
}

interface t1
{}
interface t2
{}
