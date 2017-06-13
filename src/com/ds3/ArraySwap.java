package com.ds3;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dbhattac on 3/26/2017.
 */
public class ArraySwap {

        public static void  swap(String a[],int l ,int r )
        {
            try {
                int index1 = -1, index2 = -1;
                for (int i = 0; i < a.length; i++) {
                    if (Integer.parseInt(a[i]) == l) {
                        index1 = i;
                        if (index2 > -1)
                            break;
                    } else if (Integer.parseInt(a[i]) == r) {
                        index2 = i;
                        if (index1 > -1)
                            break;
                    }
                }


                int temp = Integer.parseInt(a[index1]);
                a[index1] = a[a.length - index1 - 1];
                a[a.length - index1 - 1] = temp + "";

                temp = Integer.parseInt(a[index2]);
                a[index2] = a[a.length - index2 - 1];
                a[a.length - index2 - 1] = temp + "";
            }
            catch(NumberFormatException e)
            {}

        }

        public static void main(String args[])
        {
            try {
                Scanner sc = new Scanner(new InputStreamReader(System.in));
                String inp = sc.nextLine();
                int noe = Integer.parseInt(inp);
                String array = sc.nextLine();
                String arr[] = array.split(" ");
                //  int arr[] = new int[noe];
            /*int i = 0;
            while(i < noe)
            {
                arr[i] = Integer.parseInt(s[i]);
                i++;
            }*/

                int noop = Integer.parseInt(sc.nextLine());

                for (int j = 0; j < noop; j++) {
                    String in[] = sc.nextLine().split(" ");
                    swap(arr, Integer.parseInt(in[0]), Integer.parseInt(in[1]));

                }
                for (int k = 0; k < noe; k++) {
                    System.out.print(arr[k] + " ");
                }

            }
            catch(NumberFormatException e)
            {}

        }
}
