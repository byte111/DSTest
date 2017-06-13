package com.ds;

import java.io.*;

/**
 * Created by dbhattac on 2/28/2017.
 */
public class Serialization {
    public static void main(String args[])
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("c:\\test.txt");
            oos = new ObjectOutputStream(fos);
            C c = new C(15);
            oos.writeObject(c);
            oos.flush();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e)
        {e.printStackTrace();}

        finally {
            if(fos!=null)
            {
                try {
                    fos.close();
                }
                catch(IOException e)
                {e.printStackTrace();}
            }
            if(oos != null)
            {
                try {
                    oos.close();
                }
                catch(IOException e)
                {e.printStackTrace();}
            }

        }

        try
        {
            fis = new FileInputStream("c:\\test.txt");
            ois = new ObjectInputStream(fis);
            C c1 = (C)ois.readObject();
            System.out.println(c1.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if(fis!=null)
            {
                try {
                    fis.close();
                }
                catch(IOException e)
                {e.printStackTrace();}
            }

            if(ois != null)
            {
                try {
                    ois.close();
                }
                catch(IOException e)
                {e.printStackTrace();}
            }
        }
    }
}


class P
{
 //   private static final long serialVersionUID = 1L;
    int x;
    int y;
    P()
    {
        x=5;
        y=10;
    }

    public String toString()
    {
        return x + " , " + y ;
    }
}
class C extends P implements  Serializable
{

    private static final long serialVersionUID = 1L;

    int d;
    C(int d)
    {
        super();
        this.d = d;
    }

    public String toString()
    {
        return " , " + d;
    }
}
