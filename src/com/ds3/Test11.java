package com.ds3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dbhattac on 3/25/2017.
 */
public class Test11 implements Cloneable{

    int a ;
    public static void main(String args[]) throws CloneNotSupportedException {
   /*     List<String> list = new ArrayList<String>();
        list.add("James Gosling");
        list.add("Brendan Eich");
        list.add("Rod Johnson");
        list.add("Gavin King");
        list.add("Un Known");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Un Known")) list.remove("Un Known");}*/

         Test11 a  = new Test11();
         a.a = 5;
        Test11 b = new Test11();


        try {
            System.out.print("b == (Test11)a.clone() " + ( b == (Test11)a.clone()));
            b = (Test11)a.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.print(a.a + " " +  b.a);
    }
}
