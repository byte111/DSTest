package com.language;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by dbhattac on 6/7/2017.
 */
public class MyReflection
{
public static void main(String args[])
{
    try {
        Class classobj = Class.forName("com.language.TestRef");
        Constructor refcons =classobj.getConstructor();
        Object refobj =refcons.newInstance();
        ((TestRef)refobj).print();
    }
    catch(ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(NoSuchMethodException e)
    {
        e.printStackTrace();
    }
    catch (InstantiationException e)
    {
        e.printStackTrace();
    }
    catch(IllegalAccessException e)
    {
        e.printStackTrace();
    }
    catch(InvocationTargetException e)
    {
        e.printStackTrace();
    }
}
}
