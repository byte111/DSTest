package com.language;

import java.util.Iterator;

/**
 * Created by dbhattac on 6/10/2017.
 */
public class EvenIterator implements Iterator {

    private Object object;
    private EvenIterator()
    {

    }

    public EvenIterator iterator()
    {
        return new EvenIterator();
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
