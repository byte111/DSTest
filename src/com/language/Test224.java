package com.language;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dbhattac on 4/21/2017.
 */
public class Test224 {

    public static void main(String args[])
    {
      /*  byte i=127;

            System.out.println(i);*/
        ArrayList list = new ArrayList();
        list.add("test1");
        list.add("test2");
        list.add("test1");
        Iterator it = list.iterator();
        while (it.hasNext())
        {
          /*  if("test2".equals((String)it.next())) {
                list.remove((String) it.next());
                list.add("test3");

            }*/
           // System.out.println((String)it.next());

        }

       /* for(Object s : list)
        {
            System.out.print((String)s);
        }*/

    }
}
