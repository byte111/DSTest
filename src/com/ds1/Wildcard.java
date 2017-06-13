package com.ds1;

/**
 * Created by dbhattac on 3/8/2017.
 * '?' Matches any single character.
 '*' Matches any sequence of characters (including the empty sequence).
 */
public class Wildcard {

    public boolean isMatch(String aa,String bb)
    {
        boolean multiwildcard = false,ismatch = false;
        for(int i = 0 , j=0; i < aa.length() && j < bb.length() ; i++)
        {
            ismatch = false;
            char t1 = aa.charAt(i);
            char t2 = bb.charAt(j);
            if(t1 == t2)
            {
                j++;
                ismatch = true;
                continue;

            }
            else if(t2 == '?')
            {
                j++;
                ismatch = true;
                continue;
            }
            else if(t2 == '*')
            {
                multiwildcard = true;

            }
            else
            {
                ismatch = false ;
                break;
            }

            if(multiwildcard)
            {
                if( j == bb.length()-1)
                {
                    ismatch = true;
                    break;
                }
                else
                {
                    char t3 = bb.charAt(j+1);
                    if(t3 == '?')
                    {

                        j++;

                    }
                    else if(aa.charAt(t3) > 0 &&  aa.indexOf(t3) > i)
                    {
                       i = aa.indexOf(t3);

                        j++;

                    }
                    else
                    {
                        ismatch = false;
                        break;
                    }
                }
                multiwildcard = false;
            }

        }


        return ismatch;
    }

    public static void main(String args[])
    {
        Wildcard obj = new Wildcard();

        System.out.print(obj.isMatch("aa","a"));

    }
}
