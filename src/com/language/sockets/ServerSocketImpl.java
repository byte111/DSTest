package com.language.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by dbhattac on 6/10/2017.
 */
public class ServerSocketImpl {

    public static void main(String args[])
    {
        ServerSocket server = null;
        Socket  client = null;
        InputStream instream = null;
        Scanner scanner = null;
       OutputStream oos= null;
        try {
            server = new ServerSocket(2200, 10, InetAddress.getByName("localhost"));
            System.out.println("Listening to port 2200");
            client = server.accept();
            scanner = new Scanner(System.in);
            while(true)
            {
                instream = client.getInputStream();
                oos = client.getOutputStream();
                byte b[] = new byte[1024];
                int read = 0;
                if((read = instream.read(b)) > 0)
                {
                    System.out.println("New Chat : " + new String(b));
                }

                if(scanner.hasNext())
                {
                    oos.write(scanner.nextLine().getBytes());
                }

            }
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if(server != null)
            {
                try
                {
                    server.close();
                }
                catch(IOException e)
                {}
            }
            if(client!=null)
            {
                try
                {
                    client.close();
                }
                catch(IOException e)
                {

                }
            }
            if(instream!=null)
            {
                try
                {
                    instream.close();
                }
                catch(IOException e)
                {

                }
            }
        }
    }
}
