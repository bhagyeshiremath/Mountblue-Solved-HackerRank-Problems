
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
}

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new Buffered (new InputStreamReader(System.in));
        BufferedReader bufferedWriter = new Buffered (new FileWriter(system.getenv("OUTPUT_PATH")));
            
        int k = Integer.parseInt(bufferedReader.readLine().trim());
        int pcount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> p = IntStream.range(0, sCount).mapToObj(i -> 
        {
        try 
        {
            return bufferedReader.readLine().replaceAll("\\s+$","");  
        } 
        catch (IOException ex) 
        {
            throw new RuntimeException(ex);
        }
        }) 

        .map(String::trim)
        .map(Intger::parseInt)
        .collect(toList());

        int qCount = Integer.parseInt(buffered.readline().trim());

        List<string> t = IntStream.range(0, tCount).mapToObj(i ->
        {
            try 
            {
                return bufferedReader.readLine().replaceAll("\\s+$","");   
            } 
            catch (IOException ex) 
            {
                throw new RuntimeException(ex);
            }
            })
            .collect(toList());

            List<Integer> result = Result.KthPerson(k,p,q);

            bufferedrWriter.write(result.stream().map(Object::toString).collect(joining("\n"))+"\n");

            bufferedReader.close();
            bufferedWriter.close();
            
        }     
    }
}
