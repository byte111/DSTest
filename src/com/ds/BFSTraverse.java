package com.ds;

import java.util.*;

/**
 * Created by dbhattac on 1/12/2017.
 */
public class BFSTraverse {


    class Node {
        String data;
        Node nxtptr;
        boolean visited;
        boolean isCompared;

        public Node() {
        }

        public Node(String data) {
            this.data = data;
            nxtptr = null;
            visited = false;
            isCompared = false;
        }
    }

    class Queue {
        Node head;

        public Queue() {

        }


        public void enqueue(Node node) {
            if (head == null) {
                head = new Node();
                head = node;
                return;
            }

            Node lastnode = null;

            lastnode = head;

            while (lastnode.nxtptr != null) {
                lastnode = lastnode.nxtptr;
            }

            lastnode.nxtptr = node;
        }

        public Node dequeue() {
            if (head == null) {
                return null;
            }


            if (head.nxtptr == null) {
                Node temp = null;
                temp = head;
                head = null;
                return temp;

            }

            Node temp = head;
            head = head.nxtptr;

            return temp;
        }


    }

    class Stack {
        Node base;

        public Stack() {

        }

        public void push(Node item) {
            if (base == null) {
                base = item;
                return;
            }
            Node temp = base;
            while (temp.nxtptr != null) {
                temp = temp.nxtptr;
            }

            temp.nxtptr = item;

        }

        public Node pop() {
            if (base == null) {
                return null;
            }
            Node temp = base;
            while (temp.nxtptr != null) {
                temp = temp.nxtptr;
            }

            return temp;
        }
    }
        public static void main(String args[]) {
            Queue queue = new BFSTraverse().new Queue();
            HashMap<Node, Node> path = new HashMap<>();
            Node a = new BFSTraverse().new Node("a");
            Node b = new BFSTraverse().new Node("b");
            Node c = new BFSTraverse().new Node("c");
            Node d = new BFSTraverse().new Node("d");

            HashMap<Node, List<Node>> graphlist = new HashMap<Node, List<Node>>();

            ArrayList<Node> link1 = new ArrayList<>();
            link1.add(b);
            link1.add(c);
            graphlist.put(a, link1);

            ArrayList<Node> link2 = new ArrayList<>();
            link2.add(a);

            graphlist.put(b, link2);

            ArrayList<Node> link4 = new ArrayList<>();
            link4.add(a);
            link4.add(c);
            graphlist.put(d, link4);

            ArrayList<Node> link3 = new ArrayList<>();
            link3.add(a);
            link3.add(d);
            graphlist.put(c, link3);

            Iterator it = graphlist.keySet().iterator();

            Node key = (Node) it.next();

            queue.enqueue(key);

            while (queue != null && queue.head != null) {
                Node n = queue.dequeue();
                if (n == null) {
                    break;
                }

                n.visited = true;

                for (Node node : graphlist.keySet()) {
                    if (node != null && node.data.equals(n.data)) {
                        List<Node> chain = graphlist.get(node);
                        for (Node neighbours : chain) {
                            if (neighbours.visited) {
                                continue;
                            }
                            queue.enqueue(neighbours);

                            path.put(neighbours, node);
                        }

                        break;
                    }
                }


            }


            for (Node n : path.keySet()) {
                System.out.println(n.data + "->" + ((Node) path.get(n)).data);
            }


            Node source = a;

            Node destination = d;

            Stack keystack = new BFSTraverse().new Stack();
            Node tempkey = source;
            boolean pathexists = true;
            String fullpath = "";
            while (true) {
                tempkey.isCompared = true;
                boolean found = false;

                Set<Node> keyset = path.keySet();
                for (Node n : keyset) {
                    if (path.get(n).data.equals(tempkey.data)) {

                        fullpath = fullpath + tempkey.data;
                        found = true;
                        keystack.push(tempkey);
                        tempkey = n;
                        break;
                    }

                    if (!found) {
                        tempkey = keystack.pop();
                        if (tempkey == null) {
                            pathexists = false;

                        }
                        break;
                    }
                    // set to tempkey
                }

                if (!pathexists) {
                    break;
                }

            }


            if (!pathexists) {
                System.out.print("Path does not exist.");
            }

        }
    }


