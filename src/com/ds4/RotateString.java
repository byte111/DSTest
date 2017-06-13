package com.ds4;

/**
 * Created by dbhattac on 4/11/2017.
 */
public class RotateString {

    public static boolean  rotate(String s,String key,int rotations)
    {
        if(rotations > 2)
            return false;

        if(key.equals(s))
            return true;

        StringBuffer sb  = new StringBuffer(s.charAt(s.length()-1)+"");
        sb.append(s.substring(0,s.length()-1));
         return rotate(sb.toString(),key,rotations+1);

    }

    public static void main(String args[])
    {
        boolean b= RotateString.rotate("ONAMAZ","AMAZON",0);
        System.out.print(b);
    }
}
