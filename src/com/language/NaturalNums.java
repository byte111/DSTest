package com.language;

/**
 * Created by dbhattac on 4/23/2017.
 */
public class NaturalNums implements Runnable {
    static int i =0;
    public void run()
    {

           while(i<10) {
            synchronized (this) {
                if(i<10) {
                    System.out.println(Thread.currentThread().getName() + " ==>" + i++);
                }
            }
        }
    }

    public static void main(String args[])
    {
        Thread t1 = new Thread(new NaturalNums());
        Thread t2 = new Thread(new NaturalNums());
        t1.start();
        t2.start();

    }
}
