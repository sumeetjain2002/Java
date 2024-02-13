import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

int s=obj.nextInt();
ArrayList<String> list=stair(s);
 
for(String a :list)
{
    System.out.println(a);
}
}

public static ArrayList<String> stair(int n)
{

    if(n<0)
    {
        ArrayList <String> base=new ArrayList<>();
        return base;
    }
    if(n==0)
    {
     ArrayList <String> base=new ArrayList<>();
     base.add("");
     return base;
    }

    ArrayList<String> path1=stair(n-1);
    

    ArrayList<String> path2=stair(n-2);

    ArrayList<String> path3=stair(n-3);
   
    ArrayList<String> ans=new ArrayList<>();
    
    for(String res:path1)
    {
        ans.add("1"+res);
    }
    for(String res:path2)
    {
        ans.add("2"+res);
    }
    for(String res:path3)
    {
        ans.add("3"+res);
    }
    

return ans;
}
}