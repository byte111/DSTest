package com.ds;
import java.util.*;
/**
 * Created by dbhattac on 2/28/2017.
 */
public class RemoveDup {

    public void  removeDuplicates(String s )
    {
        Map<String,String> count = new HashMap<String,String>();
        String output = "";
        for(int i = 0; i < s.length(); i++)
        {
            char c =s.charAt(i);
            System.out.println(count.get(c));
            if((count.get(s.charAt(i)+"") == null))
            {
                count.put(s.charAt(i)+"","1");
                output+=s.charAt(i);
            }
        }
        System.out.print(output);
    }

    public static void main(String args[])
    {
        RemoveDup obj = new RemoveDup();
        obj.removeDuplicates("MAHARASHTRA");
    }
}
