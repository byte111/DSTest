package com.language;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class ConcurrentHashMapTest implements Runnable {

    ConcurrentHashMap<Sample,Sample> map = new ConcurrentHashMap<>();
    //<Sample,Sample> map = new HashMap<>();
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " is putting value in map ");

        Sample obj = new Sample();
        map.put(obj,obj);
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is getting  value in map == >  " +   map.get(0));


        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
       Thread t[] = new Thread[10];

       ConcurrentHashMapTest thiobj =  new ConcurrentHashMapTest();
       for(int i = 0; i< 10;i++)
       {
           t[i] = new Thread(thiobj);

           t[i].start();

           if(i == 0) continue;
            try {

                t[i - 1].join();
                System.out.println(t[i-1].getName() + " dying ");
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
       }


       System.out.println("Map size = " +thiobj.map.size());
    }
}


class Sample
{
    String testval= " Hello";
}
