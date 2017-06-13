package com.ds6;

import java.util.*;

/**
 * Created by dbhattac on 5/14/2017.
 */

class JobComparator implements Comparator
{
    public int compare(Object o1,Object o2) {
        Job j1 = (Job)o1;
        Job j2 = (Job)o2;
       if(j1.deadline > j2.deadline ) return  1;
        if(j1.deadline == j2.deadline)
        {
            if(j1.profit  <= j2.profit) return  1;
            else return -1;
        }
        else return -1;
    }
}
class Job
{
    int jobid;
    int deadline;
    int profit;
    public Job(int jobid,int deadline,int profit)
    {
        this.jobid = jobid;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void main(String args[])
    {
        List<Job> joblist = new ArrayList<Job>();

        Job j1 = new Job(1,2,100);
        Job j2 = new Job(2,1,19);
        Job j3 = new Job(3,2,27);
        Job j4 = new Job(4,1,25);
        Job j5 = new Job(5,3,15);

        joblist.add(j1);
        joblist.add(j2);
        joblist.add(j3);
        joblist.add(j4);
        joblist.add(j5);

        Collections.sort(joblist,new JobComparator());
        Iterator it  = joblist.iterator();
        HashMap<Integer,Job> result = new HashMap<>();
        while(it.hasNext())
        {
            Job temp = (Job)it.next();
             if(result.get(temp.deadline) == null) {
                 result.put(temp.deadline, temp);
                 System.out.println( temp.jobid + "  " + temp.deadline + " " + temp.profit);
             }
        }

    }
}
