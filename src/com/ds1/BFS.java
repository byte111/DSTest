package com.ds1;

import java.util.*;

/**
 * Created by dbhattac on 3/2/2017.
 */
public class BFS {
    ArrayList<String> shortestpath = new ArrayList<>();
    HashMap<String,String> visited = new  HashMap<String,String>();

    int[][] calcweight  ;
    public void path( LinkedHashMap<String,ArrayList<String>> path,int[][] weight)
    {
        calcweight = new int[weight.length][weight.length];
        Iterator it = path.keySet().iterator();

        while(it.hasNext())
        {

            String key = (String)it.next();

            if(Integer.valueOf(key) == 0) {
                visited.put(key,"0");
            }

            ArrayList<String> neighbour = (ArrayList<String>)path.get(key);

            Iterator it1 = neighbour.iterator();
            int maxweight = -1;
            int chosennode = -1;

            while(it1.hasNext())
            {
                int temp = weight[Integer.valueOf(key)][Integer.valueOf((String)it.next())];
                if(temp < maxweight)
                {
                    maxweight = temp;
                    chosennode = Integer.valueOf((String)it.next());
                }
            }

            int prevweight = 0;
            if(visited.get(key)!=null) {
                 prevweight = Integer.valueOf(visited.get(key));
            }


            visited.put(chosennode+"",(prevweight+maxweight)+"");
        }

    }

    public static void main(String args[])
    {
        Map<String,ArrayList<String>> path = new HashMap<String,ArrayList<String>>();

    }
}
