import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

int n=obj.nextInt();
int m=obj.nextInt();
ArrayList<String> list=maze(n,m);
 
for(String a :list)
{
    System.out.println(a);
}
}

public static ArrayList<String> maze(int n, int m)
{  
    if(n==0 && m==0)
    {
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
    }
     ArrayList<String> ans=new ArrayList<>();

    if(m>0){
    ArrayList<String> hpath=maze(n,m-1);
    for(String res:hpath)
    {
        ans.add("h"+res);
    }
    }
    
    if(n>0){
    ArrayList<String> vpath=maze(n-1,m);
    for(String res:vpath)
    {
        ans.add("v"+res);
    }
    }
    
    return ans;
}
}