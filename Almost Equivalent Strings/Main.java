import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main 
{
    static int count(String str,char ch)//function to calculate occurences                           //of character in String
    {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count; //returning count
    }
    static List<String> areAlmostEquivalent(List<String> s, List<String> t)
    {
        String[] result=new String[s.size()]; //initial result set
        for(int k=0;k<result.length;k++)
        {
            result[k]="NO";
        }
        for(int i=0;i<s.size();i++)
        {
            ArrayList <Character> stack=new ArrayList<Character>();
            if(s.get(i).length()<t.get(i).length())
            {
                for(int j=0;j<(s.get(i).length());j++)
                {
                    char ch=s.get(i).charAt(j);
                    if(!stack.contains(ch))
                    {
                        stack.add(ch);
                        int s_count=count(s.get(i),ch);
                        int t_count=count(t.get(i),ch);
                        if(s_count!=0 && t_count!=0)
                        {
                            if (Math.abs(s_count-t_count)<=3)
                            {
                                result[i]="YES"; //changing result set if
                                                //condition is matching
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
                for(int j=0;j<(t.get(i).length());j++)
                {
                    char ch=t.get(i).charAt(j);
                    if(!stack.contains(ch))
                    {
                        stack.add(ch);
                        int s_count=count(s.get(i),ch);
                        int t_count=count(t.get(i),ch);
                        if(s_count!=0 && t_count!=0)
                        {
                            if (Math.abs(s_count-t_count)<=3) //changing result set if
                                                            //condition is matching
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
        }
        return Arrays.asList(result);
    }
    public static void main(String[] args) {
        List<String> s=new ArrayList<String>();
        List<String> t=new ArrayList<String>();
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=Scan.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter value at index "+i+" for First Array");
            s.add(Scan.next());
            System.out.println("Enter value at index "+i+" for Second Array");
            t.add(Scan.next());
        }
        List<String> result=areAlmostEquivalent(s,t);
        for(String r: result)
            System.out.println(r);
        Scan.close();   
    }
}
