package com.language;

/**
 * Created by dbhattac on 4/3/2017.
 */
public class Test12  extends Test13 {
public static void main(String args[])
{
    Test12 obj1 = new Test12();
    try {
        Test12 obj2 = (Test12)obj1.clone();
        System.out.print(obj2.i + obj2.obj14.a);
    }
    catch(CloneNotSupportedException e)
    {
        e.printStackTrace();
    }


}


}


class Test13 implements Cloneable
{
    int i = 1;
    Test14 obj14 = new Test14();
}

class Test14
{
    String a = "hello";
}

class Test15
{

}