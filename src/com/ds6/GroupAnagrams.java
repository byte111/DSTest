package com.ds6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dbhattac on 4/29/2017.
 */
public class GroupAnagrams {

    static List<List<String>> getAnagrams(String s[])
    {
        if(s == null || s.length == 0)
            return null;
        if(s.length == 1)
        {
            List t = new ArrayList<>();
            t.add(new ArrayList<String>().add(s[0]));
            return t;
        }
        List<List<String>> anagrams = new ArrayList<>();
        List<List<String>> results = new ArrayList<>();

        for(int i = 0 ;i < s.length;i++)
        {
            List<String> t = listanagrams(s[i]);
            anagrams.add(t);
        }

        if(anagrams.size() ==0)
            return null;

        System.out.print(anagrams);
        for(int i = 0 ; i<s.length ;i++)
        {
            if(s[i] == null || s.length == 0)
                continue;
            int count = 0;
            Iterator it = anagrams.iterator();

            while (it.hasNext())
            {
                Iterator it1 = ((ArrayList)it.next()).iterator();
                while (it1.hasNext())
                {
                    Iterator it2 = (Iterator) it1.next();
                    while (it2.hasNext()) {

                        System.out.print("it2.next()="+it2.next());
                        if (s[i].equals( it2.next()))
                            results.get(count).add(s[i]);
                        else {
                            List<String> t = new ArrayList<String>();
                            t.add(s[i]);
                            results.add(t);
                        }
                    }
                }
                count++;
            }
        }
        return results;
    }

    static List<String> listanagrams(String s)
    {
        ArrayList<String> anagrams = new ArrayList<>();
        anagrams.add(permute(s.toCharArray(),0));
        return anagrams;
    }

    static String permute(char c[],int k )
    {
        if(k == c.length-1)
            return new String(c);
    String tt="";
        for(int i = k; i < c.length ; i++)
        {
            char t = c[k];
            c[k] = c[i];
            c[i] = t;
            tt = permute(c,k+1);
            t = c[k];
            c[k] = c[i];
            c[i] = t;
        //    System.out.println(tt);
        }
        return tt;
    }


    public static void main(String args[])
    {
        String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.print(GroupAnagrams.getAnagrams(s));
    }

}
