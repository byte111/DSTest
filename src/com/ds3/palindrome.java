package com.ds3;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dbhattac on 3/21/2017.
 */
public class palindrome {

    public static int isPalidrome(String s)
    {
        int index = -1;
        boolean left = false, right = false;
        for(int i = 0, j=s.length()-1; i < j ; )
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
                left = false;
                right = false;
                continue;
            }
            else
            {
                if((!left && !right) || !left)
                {
                    index = i;
                    i++;
                    left = true;
                    continue;
                }
                else if(!right && left)
                {
                    index = j;
                    j--;
                    i--;
                    right = true;
                    continue;
                }
                else
                {
                    index = -1;
                    break;
                }

            }
        }
        return index;
    }

    public static void main(String args[])
    {
       // palindrome obj = new palindrome();
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        String inp = sc.nextLine();
        int lines = Integer.parseInt(inp);
        String s[] = new String[lines];
        int i = 0;
        while(i < lines)
        {
            s[i] = sc.nextLine();
            i++;
        }

        for(String ss : s) {
            System.out.println(palindrome.isPalidrome(ss.trim()));
        }
    }

}


