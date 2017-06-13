package com.language;

/**
 * Created by dbhattac on 4/22/2017.
 */
public class ThreadsClass {
    public static void main(String args[])
    {
        T1 t = new T1();
        t.start();


        Thread t2 = new Thread(new T2());
        t2.start();
    }
}


class T1 extends Thread
{
    public void run(){
        System.out.print("Extending threads");
    }
}

class T2 implements Runnable
{
    public void run()
    {
        System.out.print("Implementing threads");
    }
}
