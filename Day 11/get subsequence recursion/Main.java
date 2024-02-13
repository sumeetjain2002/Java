import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

String s=obj.nextLine();
ArrayList<String> list=subsq(s);
 
for(String a :list)
{
    System.out.println(a);
}
}

public static ArrayList<String> subsq(String s)
{
    if(s.length()==0)
    {
     ArrayList <String> base=new ArrayList<>();
     base.add("");
     return base;
    }
    char a=s.charAt(0);
    String rem=s.substring(1);
    ArrayList<String> rres=subsq(rem);
    ArrayList<String> ans=new ArrayList<>();
    for(String ss :rres)
{
    ans.add(ss);
}

for(String ss :rres)
{
    ans.add(a+ss);
}

return ans;
}
}