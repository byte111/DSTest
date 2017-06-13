package com.ds1;

import java.util.*;

/**
 * Created by dbhattac on 3/13/2017.
 */
public class BFS1
{

    class QNode {
        Object data;
        QNode next;

        QNode(Object data) {
            this.data = data;
        }
    }

        public QNode enqueue(Object data,QNode start)
        {
            QNode temp = new QNode(data);
            temp.next = start;
            start = temp;
            return start;
        }
        public Object dequeue(QNode start)
        {
            QNode temp = start;
            QNode prev = start;
            while (temp.next != null)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            return  temp.data;
        }

    public void traverse(Map<String,ArrayList<String>> listmap,  String start)
    {

        QNode head = new QNode(start);
        Set visited = new HashSet();
        String temp = start;

        while(true)
        {
            if(visited.contains(temp) || temp == null)
                break;
            visited.add(temp);
            ArrayList<String> neighbours = listmap.get(temp);
            for(String s1 : neighbours)
            {
                if(visited.contains(s1))
                    continue;
                head =  enqueue(s1,head);

            }
            temp = (String)dequeue(head);

            System.out.println(temp);
            temp = (String)dequeue(head);

        }

        String vv = (String) dequeue(head);
        while( vv !=null)
        {
            System.out.println(vv);
            vv = (String) dequeue(head);
        }
    }

    public static  void main(String args[])
    {
        BFS1 obj = new BFS1();
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
        obj.traverse(listmap,"0");
    }

}
