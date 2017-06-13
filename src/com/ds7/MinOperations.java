package com.ds7;

/**
 * Created by dbhattac on 6/11/2017.
 */
public class MinOperations {

    static int minOperations(int number)
    {
        if(number == 0) return 0;

        int noop = 1;
        int sum = 1;


            while (sum < number)
            {
                sum*=2;
                noop++;
            }

            if(sum == number) return noop;

            sum/=2;
            noop-=1;
        while (sum<number)
        {
            sum+=1;
            noop++;
        }
            //noop+=(number-sum);

        return noop;
    }

    public static void main(String args[])
    {
        System.out.print(MinOperations.minOperations(7));
    }
}
