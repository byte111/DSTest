package com.ds3;

/**
 * Created by dbhattac on 3/22/2017.
 */
public class CommonNos {


    public static void commonNos(int a[],int b[],int c[])
    {
        for(int i = 0 , j = 0 , k = 0 ; i < a.length && j < b.length && k < c.length ;)
        {

            if(a[i] == b[j] && b[j] == c[k])
            {
                System.out.print(a[i]);
                i++;
                j++;
                k++;
            }
            if(a[i] < b[j])
            {
                if(a[i] < c[k])
                    i++;
                else
                    k++;
            }
            else
            {
                if(b[j] < c[k])
                    j++;
                else
                    k++;
            }

        }


    }

    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6};
        int b[] = {1,3,4,5,7};
        int c[] = {1,2,4,9};
        CommonNos.commonNos(a,b,c);
    }
}
