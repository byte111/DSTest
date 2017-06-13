package com.ds5;

/**
 * Created by dbhattac on 4/21/2017.
 */
public class ReverseNum {
    public static int reverse(int num) {
        int res = 0 , prevres = 0;


        while(num != 0)
        {
            int d = num%10;

            res = (res*10) + d;


            if(((res - d )/10) != prevres)
                return 0;
            num/=10;
            prevres = res;
        }

        return res;

    }

    public static void main(String args[])
    {
        System.out.print(ReverseNum.reverse(1));
    }
}
