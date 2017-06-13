
package com.ds1;

import java.util.*;

/**
 * Created by dbhattac on 3/9/2017.
 */
public class Dijiktras {
    public void traverse(Map<String,ArrayList<String>> listmap,int[][]weight,String start,String dest)
    {
        String s = start;
        HashSet<String> visited = new HashSet<String>();
        HashMap<String,Integer> weights = new HashMap<String,Integer>();
        weights.put(start,0);
       while(true)
        {
            if(visited.contains(s) || dest.equals(s) )
                break;
             visited.add(s);
            ArrayList<String> neighbours =  (ArrayList<String>)listmap.get(s);
            int leastval =1000;
            String leastnode = "";
            for(String s1 : neighbours)
            {
               // System.out.println("searching for s = "+ s + " s1 = " + s1);
                if(visited.contains(s1))
                {
                    continue;
                }
                int currwt = weight[Integer.parseInt(s)][Integer.parseInt(s1)];
                if(currwt  < leastval)
                {
                    leastval = currwt;
                    leastnode = s1;
                }
            }



            int temp =  weights.get(s) + leastval ;
            s = leastnode;
            weights.put(leastnode,temp);

        }

        Iterator itr = weights.keySet().iterator();
        while(itr.hasNext())
        {
            String v = (String)itr.next();
            System.out.println(v + " - " + weights.get(v));
        }
    }

    public static void main(String args[])
    {
        Map<String,ArrayList<String>> listmap = new HashMap<String,ArrayList<String>>();
        ArrayList<String> neighbours1 = new ArrayList<String>();
        neighbours1.add("1");
        neighbours1.add("5");
        listmap.put("0",neighbours1);

        ArrayList<String> neighbours2 = new ArrayList<String>();
        neighbours2.add("0");
        neighbours2.add("5");
        neighbours2.add("2");
        listmap.put("1",neighbours2);

        ArrayList<String> neighbours3 = new ArrayList<String>();
        neighbours3.add("1");
        neighbours3.add("4");
        neighbours3.add("5");
        listmap.put("2",neighbours3);

        ArrayList<String> neighbours4 = new ArrayList<String>();
        neighbours4.add("0");
        neighbours4.add("1");
        neighbours4.add("4");
        listmap.put("5",neighbours4);

        ArrayList<String> neighbours5 = new ArrayList<String>();
        neighbours5.add("2");
        neighbours5.add("3");
        neighbours5.add("5");
        listmap.put("4",neighbours5);

        ArrayList<String> neighbours6 = new ArrayList<String>();
        neighbours6.add("2");
        neighbours6.add("4");
        listmap.put("3",neighbours6);
/*


        ArrayList<String> neighbours7 = new ArrayList<String>();
        neighbours7.add("5");
        neighbours7.add("8");
        neighbours7.add("7");
        listmap.put("6",neighbours7);

        ArrayList<String> neighbours8 = new ArrayList<String>();
        neighbours8.add("0");
        neighbours8.add("8");
        neighbours8.add("1");
        neighbours8.add("6");
        listmap.put("7",neighbours8);


       ArrayList<String> neighbours9 = new ArrayList<String>();
        neighbours9.add("2");
        neighbours9.add("6");
        neighbours9.add("7");
        listmap.put("8",neighbours9);

*/
        int a[][] = {
                     {-1,3,-1,-1,-1,2},
                     {3,-1,4,-1,2,2},
                     {-1,4,-1,1,3,-1},
                     {-1,-1,1,-1,2,-1},
                     {-1,2,3,2,-1,1},
                     {2,2,-1,-1,1,-1},
                    };
        com.ds1.Dijiktras onj = new com.ds1.Dijiktras();
        onj.traverse(listmap,a,"0","3");


    }
}
