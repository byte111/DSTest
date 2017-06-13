package com.ds6;

/**
 * Created by dbhattac on 5/20/2017.
 */
public class PeakElement {
    static int findPeak(int arr[])
    {
        if(arr == null ) return -1;
        if(arr.length == 0) return -1;
        if(arr.length == 1) return  0;

        int peakelem = 0,i=1;
        for( ; i <arr.length ; i+=3)
        {
            int temp1 = peakelem, temp2= peakelem;
            if(arr[i] > arr[i-1] )
            {
                temp1 = i;
            }
            else
            {
                temp1 =i-1 ;
            }
            try {
                if (arr[i] > arr[i + 1]) {
                    temp2 = i;
                } else {
                    temp2 = i + 1;
                }
            }

            catch(ArrayIndexOutOfBoundsException e){}
            if( arr[temp1] < arr[temp2]) {
                if(arr[peakelem] < arr[temp2])
                     peakelem = temp2;
            }
            else
            {
                if(arr[peakelem] < arr[temp1])
                    peakelem = temp1;
            }
        }


        if(i - (arr.length-1) >= 1 && i-(arr.length-1) <=2)
        {
            i-=3;
            for(int j = i ; j<arr.length ;j++)
                if(arr[j] > arr[peakelem]) peakelem = j;
        }
        return peakelem;
    }

    public static void main(String args[])
    {
        int arr[] = {-1,1,2};
        System.out.print(PeakElement.findPeak(arr));
    }
}
