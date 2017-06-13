package com.language;

import java.io.*;

/**
 * Created by dbhattac on 4/23/2017.
 */
public class Files {


   /* public static void main(String args[])
    {


        File f= new File("C:\\test_file.txt");
        try {
            InputStream in = new FileInputStream(f);
            byte b[] = new byte[1024];
            while(in.read(b) > 0)
            {
                for(byte b1:b)
                System.out.print((char)b1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }*/
   public static void main(String args[])
   {
       try {
          // FileOutputStream fos = new FileOutputStream("test.txt");
          // OutputStream out = new BufferedOutputStream(new FileOutputStream(new File("")));

           InputStream fis = new BufferedInputStream(new FileInputStream(""));
           BufferedWriter writer = new BufferedWriter(new PrintWriter(System.out));
           writer.write("hello");
           writer.flush();
           writer.close();
           /* PrintWriter pw = new PrintWriter(out);
           pw.print("test");
           pw.flush();
           pw.close();*/
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
   }
}

class TestA
{
    public void m1(String args[])
    {
        System.out.print("In TestA");
    }
}

class TestB extends TestA
{
    public void m1(String args[])
    {
        System.out.print("In TestB");
    }
}
