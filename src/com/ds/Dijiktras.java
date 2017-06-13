package com.ds;
import java.util.*;
/**
 * Created by dbhattac on 2/8/2017.
 */
public class Dijiktras

{

    private static void creategraph(HashMap<String,List<String>> listmap)
    {
        ArrayList<String> adjacency = new ArrayList<String>();
        adjacency.add("b");
        adjacency.add("d");
        listmap.put("a",adjacency);

        ArrayList<String> adjacency1 = new ArrayList<String>();
        adjacency.add("c");
        adjacency.add("d");
        listmap.put("b",adjacency);


        ArrayList<String> adjacency2 = new ArrayList<String>();
        adjacency.add("b");
        adjacency.add("e");
        adjacency.add("f");
        listmap.put("c",adjacency);


        ArrayList<String> adjacency3 = new ArrayList<String>();
        adjacency.add("a");
        adjacency.add("e");
        adjacency.add("b");
        listmap.put("d",adjacency);

        ArrayList<String> adjacency4 = new ArrayList<String>();
        adjacency.add("c");
        adjacency.add("f");
        listmap.put("e",adjacency);

        ArrayList<String> adjacency5 = new ArrayList<String>();
        adjacency.add("d");
        adjacency.add("c");
        adjacency.add("f");
        listmap.put("e",adjacency);

        ArrayList<String> adjacency6 = new ArrayList<String>();
        adjacency.add("c");
        adjacency.add("e");
        listmap.put("f",adjacency);
    }

    private static void assigncost(HashMap<String,String> listcost)
    {
        listcost.put("ab","2");
        listcost.put("ba","2");
        listcost.put("ad","3");
        listcost.put("da","3");
        listcost.put("bd","5");
        listcost.put("db","5");
        listcost.put("bc","4");
        listcost.put("cb","4");
        listcost.put("de","6");
        listcost.put("ed","6");
        listcost.put("ce","6");
        listcost.put("ec","6");
        listcost.put("cf","8");
        listcost.put("fc","8");
        listcost.put("ef","10");
        listcost.put("fe","10");

    }

    class Node
    {
         String vertex;
         boolean visited;
        int cost ;
        public Node(String vertex)
        {
            this.vertex = vertex;
            visited = false;
            cost = -1;
        }
    }
    public  static void main(String args[])
    {
        HashMap<String,List<String>> listmap  = new  HashMap<String,List<String>>();
        HashMap<String,String> listcost  = new  HashMap<String,String>();
        creategraph(listmap);
        assigncost(listcost);

        String source = "a" , destination = "f";

        Dijiktras.Node a = new Dijiktras().new Node("a");
        Dijiktras.Node b = new Dijiktras().new Node("b");
        Dijiktras.Node c = new Dijiktras().new Node("c");
        Dijiktras.Node d = new Dijiktras().new Node("d");
        Dijiktras.Node e = new Dijiktras().new Node("e");
        Dijiktras.Node f = new Dijiktras().new Node("f");

        List<Dijiktras.Node> nodelist = new ArrayList<Dijiktras.Node>();
        nodelist.add(a);
        nodelist.add(b);
        nodelist.add(c);
        nodelist.add(d);
        nodelist.add(e);
        nodelist.add(f);

        while(source.length() > 0) {


            for (Dijiktras.Node node : nodelist) {
                if (node.vertex.equals(source)) {
                    node.visited = true;
                    node.cost = 0;


                    //find adjacent nodes

                    List<String> adjacencylist = listmap.get(node.vertex);
                    String shortestedge = "";
                    int leastcost = -1;
                    int alladjacentvisited = 0;

                    while (alladjacentvisited < adjacencylist.size()) {
                        for (String adjacent : adjacencylist) {

                            boolean repeat = false;
                            for (Dijiktras.Node n1 : nodelist) {
                                if (n1.vertex.equals(adjacent)) {
                                    if (node.visited) {
                                        repeat = true;
                                        break;
                                    }
                                }
                            }

                            if (repeat) {
                                continue;
                            }
                            if (Integer.parseInt(listcost.get(node.vertex + adjacent)) > leastcost) {
                                leastcost = Integer.parseInt(listcost.get(node.vertex + adjacent));
                                shortestedge = node.vertex + adjacent;
                            }
                        }

                        String edgedest = shortestedge.substring(1);
                        for (Dijiktras.Node n1 : nodelist) {
                            if (n1.vertex.equals(source)) {
                                n1.cost = leastcost;
                                n1.visited = true;
                            }
                        }

                        alladjacentvisited++;
                    }


                }

                int mincost = -1;
                source="";
                for (Dijiktras.Node n1 : nodelist) {
                    if (n1.visited && mincost < n1.cost) {
                        mincost = n1.cost;
                        source = n1.vertex;
                    }
                }

            }
        }











    }
}
