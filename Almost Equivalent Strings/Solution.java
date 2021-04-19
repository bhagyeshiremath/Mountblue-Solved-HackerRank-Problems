import java.io.IOException;
import java.util.*;
public class Result
{
    public static int count(String str , char ch)
    {
        int count= 0;
        for(int i = 0; i < str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
            count++;
            }
        }
        return count;
    }

    public static List<String> areAlmostEquivalent(List<String> s, List<String> t)
    {
        String[] result = new String[s.size()];
        for(int k= 0; k < result.length ; k++)
        {
            result[K]="NO";
        }
        for(int i=0;i<s.size();i++)
        {
            ArrayList <Character> Stack = new ArrayList<Character>();
            if(s.get(i).length() < t.get(i).length)
            {
                for(int j=0 ; j<(s.get(i).length());i++)
                {
                    char ch = s.get(i).charAt(j);
                    if(!stack.contains(j))
                    {
                        stack.add(ch);
                        int s_count = count(s.get(i) , ch);
                        int t_count = count(t.get(i) , ch);
                        if(s_count!=0 && t_count!=0)
                        {
                            if(Math.abs(s_count - t_count) <= 3)
                            {
                                result[i]="YES";
                            }
                            else
                            {
                                result[i]="NO";
                                break;
                            }
                        }
                    }
                }
            }
            else
            {
                for(int j=0 ; j<(t.get(i).length());j++)
                {
                    char ch = s.get(i).charAt(j);
                    if(!stack.contains(ch))
                    {
                        stack.add(ch);
                        int s_count = count(s.get(i) , ch);
                        int t_count = count(t.get(i) , ch);
                        if(s_count!=0 && t_count!=0)
                        {
                            if(Math.abs(s_count - t_count) <= 3)
                            {
                                result[i]="YES";
                            }
                            else
                            {
                                result[i]="NO";
                                break;
                            }
                        }
                    }
                }
            }
            return Arrays.asList(result);
        }
    }

    public class Solution
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader bufferedReader = new Buffered (new InputStreamReader(System.in));
            BufferedReader bufferedWriter = new Buffered (new FileWriter(system.getenv("OUTPUT_PATH")));

            int sCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> s = IntStream.range(0, sCount).mapToObj(i -> 
            {
                try 
                {
                  return bufferedReader.readLine();  
                } 
                catch (IOException ex) 
                {
                    throw new RuntimeException(ex);
                }
            })
                .collect(toList());

                int tCount = Integer.parseInt(buffered.readline().trim());

                List<string> t = IntStream.range(0, tCount).mapToObj(i ->
                {
                    try 
                    {
                        return bufferedReader.readLine();   
                    } 
                    catch (IOException ex) 
                    {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

                List<String> result = Result.areAlmostEquivalent(s, t);

                bufferedWriter.write(result.stream().collect(joining("\n"))+"\n");

                bufferedReader.close();
                bufferedWriter.close();
        }
    }
}
