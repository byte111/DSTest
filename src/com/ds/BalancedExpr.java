package com.ds;

/**
 * Created by dbhattac on 2/25/2017.
 */

class NNode
        {
            NNode next;
            char data;
            public NNode(char data)
            {
                this.data = data;
            }
        }
public class BalancedExpr {

     NNode root;
    public void push(char data)
    {
        if(root == null)
        {
            root= new NNode(data);
        }
        else
        {
            NNode temp = root;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            NNode newnode = new NNode(data);
            temp.next  = newnode;
        }
    }

    public char pop()
    {
        if(root == null)
        {
            return ' ';
        }
        else
        {
            NNode temp = root,prevnode=null;
            while(temp.next != null)
            {
                prevnode = temp;
                temp = temp.next;
            }

            if(prevnode != null) {
                char data = prevnode.data;
                prevnode.next = null;
                return data;
            }
            else
            {
                char data = root.data;
                root= null;
                return data;
            }

        }
    }

    public static void main(String args[])
    {
       //String expr = args[0];
        String expr = "abcd{}[)a]";
        BalancedExpr obj = new BalancedExpr();
        boolean ismatch = true;
        for(char c : expr.toCharArray())
        {
            if(c == '{' || c == '[' || c == '(')
            {
                obj.push(c);
            }
            else if(c == '}' || c == ']' || c == ')')
            {
                char data  = obj.pop();
                if((data == '{' && c == '}') ||
                        (data == '[' && c == ']') ||
                        (data == '(' && c == ')'))
                {
                    continue;
                }
                else
                {
                    ismatch = false;
                    break;
                }
            }


        }

        if(!ismatch) {
            System.out.print(expr + "ismatch" + ismatch);
        }
        else if(ismatch && obj.root == null)
        {
            System.out.print(expr + "ismatch" );
        }
        else
        {
            System.out.print(expr + "is not match" );
        }

    }
}
