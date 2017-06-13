package com.language;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * Created by dbhattac on 4/20/2017.
 */
public class Factory {

    private HashMap productregisteredmap = new HashMap();

    public void registerproduct(String productid,Class productclass)
    {
        productregisteredmap.put(productid,productclass);
    }

    public Product createProduct(String productid)
    {
        try
        {
            Class productclass = (Class)productregisteredmap.get(productid);
            //System.out.print(productclass.getDeclaredConstructor());
            Constructor constructor = productclass.getConstructor();
            return   (Product)constructor.newInstance(new Object[]{});
        }
        catch(NoSuchMethodException exp)
        {
            exp.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String argsp[])
    {
        Factory factory = new Factory();
        factory.registerproduct("rectangle",Rectangle.class);
        factory.registerproduct("circle",Circle.class);
        Product prod  = factory.createProduct("rectangle");


    }

}

 interface Product
{
    public  void print(String s);
}

class Rectangle implements Product
{
   public Rectangle()
    {
        print("A rectangle is created..");

    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}

class Circle implements Product
{
    public   Circle()
    {
        print("A circle is created..");
    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
