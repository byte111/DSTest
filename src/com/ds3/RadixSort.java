package com.ds3;

/**
 * Created by dbhattac on 3/27/2017.
 */
public class RadixSort {

    public static void sort(int a[])
    {
        int maxdigits = 0;
        for(int i = 0 ; i < a.length; i++)
        {

            int t = a[i] ,digits = 0;

            while(t > 0)
            {
                t = t/10;
                digits++;
            }
            if(digits > maxdigits)
                maxdigits = digits;
        }


        int count = 1;
        while(count <= maxdigits)
        {

            for(int i = 0 ; i < a.length;i++)
            {
                int temp1 = a[i],count1=0,digit1 = 0 ;

                int c = count;
                int divisor =1;

                while(count1 < count)
                {
                    digit1 = temp1%10;
                    temp1 = temp1/10;
                    count1++;
                }



                for(int k = 0; k < i ; k++)
                {
                    int temp2 = a[k],count2=0,digit2=0;
                    while (count2 < count)
                    {
                        temp2 = temp2/10;
                        digit2 = temp2%10;
                        count2++;
                    }

                    if(digit1 < digit2)
                    {
                        int t = a[i];
                        a[i] = a[k];
                        a[k] = t;
                    }

                }
            }

           count++;
        }

        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + "  ");
        }
    }

    public static void main(String args[])
    {
        int a[] = {3,2,1006,100,10118};
        RadixSort.sort(a);
    }
}
