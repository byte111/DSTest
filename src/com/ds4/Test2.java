package com.ds4;

/**
 * Created by dbhattac on 3/30/2017.
 */
public class Test2 implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String args[])
    {
        Thread t = new Thread(new Test2());
      //  t.wait();
        t.notify();
    }
}
