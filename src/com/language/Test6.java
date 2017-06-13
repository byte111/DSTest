package com.language;

/**
 * Created by dbhattac on 4/12/2017.
 */
public class Test6 extends Thread {
    public Test6(){}
    public Test6(Runnable r)
    {
        super(r);

    }
    public void run()
    {
        System.out.print("Test6");
    }

    public static void main(String a[])
    {
        new Test6(new Test7()).start();
        new Test6().start();
        new Thread(new Test7()).start();
    }
    public static void main()
    {

    }
}

class Test7 implements Runnable
{
    public void run()
    {
        System.out.print("Test7");
    }
}
