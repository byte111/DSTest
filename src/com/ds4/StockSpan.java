package com.ds4;

/**
 * Created by dbhattac on 4/5/2017.
 */
class Stock
{
    int price;
    int span=1;
    Stock next;

    Stock(int price)
    {
        this.price=price;
    }
}
public class StockSpan {
    Stock head;
    int elements = 0;
    int output[] = new int[5];
    public void push(int price)
    {
        elements ++;
        int count=0;
        if(head == null )
            head = new Stock(price);
        else
        {
            if(price > peek())
            {
                Stock t = pop();
                count++;
            }
        }
    }

    public int peek()
    {
        Stock t = head;
        while(t.next!=null)
            t=t.next;
        return t.price;
    }

    public Stock pop()
    {
        Stock t = head;
        while(t.next.next!=null) t= t.next;
        elements--;
        Stock temp = t.next;
        t.next= null;
        return temp;
    }

}
