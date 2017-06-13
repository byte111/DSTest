package com.ds3;

import java.io.*;

/**
 * Created by dbhattac on 3/29/2017.
 */
public class QuickSort implements Runnable {

    private static int count = 0;
    public void quicksort(int a[])
    {

    }

    @Override
    public void run() {
        System.out.println(count);
        count++;
    }

    public static void main(String args[])
    {
        Thread t = new Thread(new QuickSort());

        for(int i =0;i<10;i++)
        {
            t = new Thread(new QuickSort());
            t.start();
        }

//        t.start();


        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("")));
            while(bis.read()>0)
            {
              //  bis.read()
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
