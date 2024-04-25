import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

System.out.println("Enter String:");

String s=obj.next();

ArrayList<String> a=ss(s);

//subsequence --> every char has its choice to include in that or not.
//substring --> every possiblility to start char to end char like for abc--> a,ab,abc,b,bc,c are the outcomes.
System.out.println(a);
}

public static ArrayList<String> ss(String s)
{
    if(s.length()==0)
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("");
        return a;
    }
  char a=s.charAt(0);
  s=s.substring(1);
 
  ArrayList<String> sol1=ss(s);
  ArrayList<String> res=new ArrayList<String>();
 
  for(String sol :sol1)
  {
   res.add(sol);
   res.add(a+sol);
  }
   
  return res;
}
}