package com.language;

import java.io.*;

/**
 * Created by dbhattac on 4/23/2017.
 */
public class File1 {
    public static void main(String args[])
    {
        try {

            FileOutputStream fos = new FileOutputStream("");
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            BufferedWriter bwriter  =  new BufferedWriter(writer);
            PrintWriter pwriter  = new PrintWriter(bwriter);


            FileWriter fwriter = new FileWriter("");
            pwriter = new PrintWriter(fwriter);


            FileInputStream fis = new FileInputStream("");
            InputStreamReader reader = new InputStreamReader(fis);
            BufferedReader breader = new BufferedReader(reader);
            while(breader.readLine()!="\r")
            {

            }

            FileReader freader = new FileReader("");
            breader = new BufferedReader(freader);
            while(breader.readLine()!="\r")
            {

            }

            InputStream istream = new FileInputStream("");
            BufferedInputStream bis = new BufferedInputStream(istream);
            byte b[] = new byte[1024];
            while(bis.read(b) > 0)
            {

            }

            FileOutputStream fos1 = new FileOutputStream("");
            BufferedOutputStream bos = new BufferedOutputStream(fos1);
            bos.write(b);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
