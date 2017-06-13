
package com.ds;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dbhattac on 3/1/2017.
 */

class A
{
    public void test() throws FileNotFoundException
    {
        /*try
        {
            throw new RuntimeException();
        }
        catch(RuntimeException e)
        {}*/

    }
}

class B extends A
{
    public void test() throws FileNotFoundException
    {
      /*  try
        {
            throw new EOFException();
        }
        catch(EOFException e)
        {}*/

    }
}
public class Test11 {
    public static void main(String args[])
    {
      String te[] = "22|Data Structures|45".split("\\|");
        System.out.print(te[0]);
    }


}
class D
{


}