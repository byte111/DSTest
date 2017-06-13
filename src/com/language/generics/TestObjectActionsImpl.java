package com.language.generics;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class TestObjectActionsImpl<E> implements ObjectActions<E>{

    E data;
    public E getData()
    {
        return this.data;
    }
    public void setData(E data){
        this.data = data;
    }

    public static void main(String args[])
    {
        TestObjectActionsImpl obj = new TestObjectActionsImpl();
        obj.setData("Hello");
        System.out.println(obj.getData());

        obj.setData(1f);
        System.out.println(obj.getData());


    }
}


