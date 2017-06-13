package com.ds1;

/**
 * Created by dbhattac on 3/12/2017.
 */
public class TimeDiff {

    public void finddiff(String [] t)
    {
        String mindiff = "";
        for(int i = 0 , j =1 ;  j < t.length ; i++,j++)
        {

            String t1[] = t[i].split("\\:");
            String t2[] = t[j].split("\\:");


            if(Integer.parseInt(t1[0]) > Integer.parseInt(t2[0]))
            {

            }
            else
            {

            }
        }
    }
}
