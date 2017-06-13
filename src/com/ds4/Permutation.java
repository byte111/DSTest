package com.ds4;

/**
 * Created by dbhattac on 4/12/2017.
 */
public class Permutation {

    public static void permute(int arr[],int k)
    {
      if(k == arr.length)
      {
          print(arr);
      }
        else
        {
            for(int i = k ;i < arr.length ; i++)
            {
                int t = arr[k];
                arr[k] = arr[i];
                arr[i] = t;
                permute(arr,k+1);
                t = arr[k];
                arr[k] = arr[i];
                arr[i] = t;

            }
        }
    }

    public static void permute(char arr[],int k)
    {
        if(k == arr.length)
        {
            print(arr);
        }
        else
        {
            for(int i = k ;i < arr.length ; i++)
            {
                char t = arr[k];
                arr[k] = arr[i];
                arr[i] = t;
                permute(arr,k+1);
                t = arr[k];
                arr[k] = arr[i];
                arr[i] = t;

            }
        }
    }

    public static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i + ",");
        System.out.println();
    }

    public static void print(char arr[])
    {
        for(char i : arr)
            System.out.print(i + ",");
        System.out.println();
    }

    public static void main(String a[])
    {
       // int arr[] =  {1,2,3};
        Permutation.permute("HELLO".toCharArray(),0);
    }


}

class T implements Runnable{
    public void run()
    {

    }
    public static void main(String args[])
    {
        Thread t = new Thread(new T());
    }

}

class T1 extends Thread
{
    public void run()
    {}
    public static void main(String args[])
    {
        Thread t;
        t = new Thread(new T1());
    }
}
