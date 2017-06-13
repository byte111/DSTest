package com.ds;

/**
 * Created by dbhattac on 1/28/2017.
 */
public class XOR {


   public int  getXOR(int n1,int n2 )
    {
        return  n1^n2;
    }


   /* public int getXORValue(int n1,int n2)
    {
        byte[] num1 = getBinary(n1);
        byte[] num2 = getBinary(n2);

        for()
    }
*/
   public static  void main(String args[])
   {
       if(args == null || args.length <2)
       {
           //"Insufficient data";
       }
       try
       {
           int n1 = Integer.parseInt(args[0]);
           int n2 = Integer.parseInt(args[1]);
           int max = -1;
           if(n1>=n2)
           {
               // improper data
           }
           else
           {
               for(int i =n1 ; i <= n2 ; i++)
               {
                   for(int j =i ; j <= n2 ; j++)
                   {
                       max = (i ^ j ) > max ? i^j : max;
                   }
               }
               System.out.print(max);
           }
       }
       catch(Exception e)
       {
           //just ignore
       }

   }
}
