package com.language;

/**
 * Created by dbhattac on 4/12/2017.
 */
public class Test123  implements Runnable  {

    private static int counter  = 0 ;

public void run()
{
        while(counter < 5)
        {
            System.out.println(" Value of counter read by " + Thread.currentThread().getName() + " : " +  counter);
            counter++;
            try {

                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

}

public static void main(String argssp[])
{
    Thread t = new Thread(new Test123(), " ChildThread");

    t.start();

    while(counter < 5)
    {
        System.out.println(" Value of counter read by " + Thread.currentThread().getName() + " : " +  counter);
        try {

            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
}


