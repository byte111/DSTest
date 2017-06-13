package com.ds3;

/**
 * Created by dbhattac on 3/27/2017.
 */

class SN
{
    String s;
    SN next;
    SN(String s)
    {
        this.s  = s;
    }
}
public class StringRev {

    SN start;

    public void push(String s)
    {
        if(start == null)
        {
            start  = new SN(s);
        }
        else
        {
            SN temp = start;
            while (temp.next!= null)
                temp = temp.next;

            temp.next = new SN(s);
        }
    }
    public String pop()
    {
       SN t = start,p=start;

        if(start.next == null)
        {
            String d = start.s;
            start = null;
            return  d;
        }
        while(t!= null && t.next!=null) {
            p= t;
            t = t.next;
        }
        String out = t.s;
        p.next = null;
        return out;
    }

    public static void main(String ssd[])
    {
        String s = "HELLO";
        StringRev obj = new StringRev();
        for(int i  = 0 ;  i < s.length(); i++)
        {
            obj.push(s.charAt(i)+"");
        }

        for(int i = 0 ; i < s.length();i++)
            System.out.print(obj.pop());
    }



}
