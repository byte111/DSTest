package com.language;

import java.util.ArrayList;

/**
 * Created by dbhattac on 4/12/2017.
 */
public class Test9 implements Runnable{

    public void run()
    {

        System.out.print(Thread.currentThread().getName());
        throw new IllegalStateException();

    }

    public static void main(String a[])
    {
        Test9 t9 =  new  Test9();
        Thread t = new Thread(t9);
        t.start();

        try
        {}
        finally {

        }

    }
}
