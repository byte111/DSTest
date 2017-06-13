package com.ds1;

/**
 * Created by dbhattac on 3/14/2017.
 */
public class Permutation {

  public static void main(String args[])
  {
      Permutation obj = new Permutation();
      obj.permute("ABC",0);

  }

  public void permute(String s,int k )
  {
      if(k == s.length() -1)
      {
          return;
      }
      String t="";

      for(int i = k; i<s.length() ; i++)
      {
          char c = s.charAt(i);
          t = s.substring(0,i) + c + s.substring(i+1,s.length());
          System.out.println(t);
          permute(t,i+1);
          t = s.substring(0,i)  + s.substring(i+1,s.length()) + c;
          System.out.println(t);
          permute(t, i );
      }

  }
}
