// Refer This Solution if you want to run the code on your local IDE of your machine
// ie: Visual studio , Linux terminal , Windows command prompt , Eclipse etc

import java.util.*;
public class Result
{
    public static List <Integer> kthPerson(int k, List<Integer>p , List<Integer>q)
    {
        List<Integer> result_set = new ArrayList<Integer>();
        for(int i=0 ; i<q.size();i++)
        {
            int cnt=0 , j;
            for(j=0 ; j<p.size(); j++)
            {
                if(p.get(j)>=q.get(i))
                {
                    cnt++;
                    if(cnt==k)
                    {
                        break;
                    }
                }
            }
        }
        if(cnt<k)
        {
            result_set.add(0);
        }
        else
        {
            result_set.add(j+1);
        }
        return result_set;
    }

    public static void main(String[] args)
    {
        int k=3;//Capacity of train
        int n=3;//No people in queue
        List<Integer>p=new ArrayList<Integer>();
        p.add(2);
        p.add(5);
        p.add(3);
        List<Integer>q=new ArrayList<Integer>();
        int j=2;
        q.add(1);
        q.add(5);
        List<Integer> result=kthPerson(k,p,q);
        for(int i:result)
        {
            System.out.println(i);
        }
    }
}
