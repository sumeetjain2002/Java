import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
ArrayList <String> list=new ArrayList<>();
String s=obj.nextLine();
list=ssq(s);
System.out.println(list+"  "+list.size());

}

public static ArrayList<String> ssq(String s)   // Subsequence code
{
    if(s.length()==0)
    {
        ArrayList<String> li=new ArrayList<>();
        li.add("");
        return li;
    }
    char f=s.charAt(0);
    String rem=s.substring(1);
    ArrayList <String> rres=ssq(rem);
    ArrayList<String> result=new ArrayList<>();
    for(String res:rres)
    {
     result.add(""+res);   
    }

    for(String res:rres)
    {
     result.add(f+res);   
    }
    return result;
}

}