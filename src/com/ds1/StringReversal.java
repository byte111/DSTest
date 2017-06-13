package com.ds1;

/**
 * Created by dbhattac on 3/20/2017.
 */
public class StringReversal {


    /*public static void reverse(char i[],char[]o,int len)
    {
        if(len == 0 )
            return ;
        char temp[] = new char[i.length - 1];
        for(int ii = 0 ; ii< i.length - 1 ; ii++)
        {
            temp[ii] = i[ii];
        }
        char temp2[] = new char[o.length+1];

        for(int jj=0;jj<o.length;jj++)
        {
            temp2[jj] = o[jj];
        }
        temp2[temp2.length-1] = i[i.length - 1];
        reverse(temp,temp2,len-1);

        if(temp2.length ==6)
            System.out.println( temp2);
      //  return temp2;

    }*/

    public static char[] reverse(char i[],char[]o,int len)
    {
        if(len == 1 )
            return i;
        char temp[] = new char[i.length - 1];
        for(int ii = 0 ; ii< i.length - 1 ; ii++)
        {
            temp[ii] = i[ii];
        }
        char temp2[] = new char[o.length+1];

        for(int jj=0;jj<o.length;jj++)
        {
            temp2[jj] = o[jj];
        }
        temp2[temp2.length-1] = i[i.length - 1];
       String s  = new String( reverse(temp,temp2,len-1));

        return s.toCharArray();


    }

    public static void main(String args[])
    {
        char i[] = {'S','T','A','T','U','S'};
      //  char i[] = {'a','b','c'};
        char o[] = new char[0];
     //   System.out.println(StringReversal.reverse(i,o,i.length));
        StringReversal.reverse(i,o,i.length);
    }
}
