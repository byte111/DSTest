package com.ds4;

import java.util.LinkedList;

/**
 * Created by dbhattac on 4/12/2017.
 */
public class Parenthesis {

    static LinkedList parenthesis  = new LinkedList();
    public static boolean parenthesis(String s)
    {
        for(int i  = 0 ; i < s.length(); i ++)
        {
            if(s.charAt(i) == '(')
                parenthesis.add('(');
            else
            {
                if(parenthesis.size() > 0 &&  (Character)parenthesis.get(parenthesis.size()-1) == '(')
                {
                    parenthesis.remove(parenthesis.size()-1);

                }
                else
                {
                    return false;
                }
            }
        }

        return !( parenthesis.size() > 0);
    }

    public static void main(String args[])
    {
       System.out.print( Parenthesis.parenthesis("()()(()()(())(())()((()))"));
    }
}
