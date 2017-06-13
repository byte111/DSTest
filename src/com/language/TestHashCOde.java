package com.language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dbhattac on 5/21/2017.
 */
public class TestHashCOde {

    public int hashCode()
    {
        System.out.println("calling hashcode");
        return  1;
    }

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("calling equals");
        return true;
    }

    public static void main(String args[])
    {

        LinkedList l = new LinkedList();
        HashMap<TestHashCOde,TestHashCOde> map = new HashMap<TestHashCOde,TestHashCOde>();
        TestHashCOde obj = new TestHashCOde();
        TestHashCOde obj1 = new TestHashCOde();
        map.put(obj,obj);
        map.put(obj1,obj);
        map.get(obj1);
        System.out.print(map.size());
    }
}
