package com.ds5;

/**
 * Created by dbhattac on 4/21/2017.
 */
public class ValidPalindrome {
    static boolean validate(String s)
    {
        char arr[] = s.toCharArray();
        int i  = 0, j = arr.length-1;
        boolean bool = true;
        while(i < j )
        {
            int a = (int)arr[i];
            int b = (int)arr[j];
          if(!(( a >= 65 && a <=90) || (a  >= 92 && a <=127) || (a >= 48 && a <=57)))
            {
                bool = false;
                i++;
                continue;
            }
        else  if(!((b >= 65 && b <=90) || (b >= 92 && b <=127) || (b >= 48 && b <=57)))
            {
                bool = false;
                j--;
                continue;
            }

         else   if(
                  (a == b) ||
                          (isChar(a) && isChar(b) && (((a  >  b)) ?
                            ((a - 32) == b)  :
                            ((b - 32) == a)))
                    )
            {
                bool = true;
                i++;
                j--;
                continue;
            }
            else {

              return false;
          }

        }
        return true && bool;
    }

    private static boolean isChar(int a)
    {
            return ( a >= 65 && a <=90) || (a  >= 92 && a <=127);
    }

    public static void main(String args[])
    {
        System.out.print(ValidPalindrome.validate("a."));
    }
}
