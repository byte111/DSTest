package com.ds;

/**
 * Created by dbhattac on 2/23/2017.
 */

//wrong
public class ContiguousSubarray {

    public static void main(String args[])
    {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0,largestsum=0 ;
        int j = 0 ;

        while(j<arr.length) {
            sum = 0;
            for (int i = j; i < arr.length; i++) {
                sum += arr[i];
                if (sum > largestsum) {
                    largestsum = sum;
                }
            }

            /*for(int i = arr.length -1 ; i > j ; i i--)
            {

            }*/
            j++;
        }

        System.out.print(largestsum);

    }
}
