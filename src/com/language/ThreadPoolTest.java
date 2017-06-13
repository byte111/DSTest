package com.language;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dbhattac on 5/14/2017.
 */
public class ThreadPoolTest {
    public static void main(String args[])
    {
        ExecutorService fixedpool = Executors.newFixedThreadPool(5);

        fixedpool.submit(new Test());
        fixedpool.shutdown();
    }
}

class Test implements Runnable
{

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + " executing.");
    }
}
