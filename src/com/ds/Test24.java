package com.ds;
import java.util.*;
import java.io.*;
/**
 * Created by Devashish on 3/2/2017.
 */


class Data
{
    String subject;
    Integer ID;
    Integer marks;

    public Data(Integer ID, String subject, Integer marks)
    {
        this.subject = subject;
        this.ID = ID;
        this.marks = marks;
    }
}
public class Test24 {

    public static Map<String,Integer> processData(ArrayList<String> array) {
        /*
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        List<Data> tempstorage = new ArrayList<Data>();
        Iterator<String> it = array.iterator();

        while(it.hasNext())
        {
            String line   = (String)it.next();
            String temp[]= line.split("\\|");
           // System.out.print(line);
            Data tempobj = new Data(Integer.parseInt(temp[0]),temp[1],Integer.parseInt(temp[2]));
            tempstorage.add(tempobj);

        }

        Iterator<Data> it1 = tempstorage.iterator();
        HashMap<String,Integer> lowestindexmap = new HashMap<String,Integer>();
        while(it1.hasNext())
        {
           Data tempval = (Data)it1.next();
            if(lowestindexmap.get(tempval.subject) == null)
            {
                lowestindexmap.put(tempval.subject,tempval.ID);
                retVal.put(tempval.subject,tempval.marks);
            }
            else
            {
                int  t = lowestindexmap.get(tempval.subject);
                if(t > tempval.ID)
                {
                    lowestindexmap.put(tempval.subject,tempval.ID);
                    retVal.put(tempval.subject,tempval.marks);
                }

            }


        }

        return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("c:\\input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("c:\\output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
