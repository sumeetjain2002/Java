import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int x=obj.nextInt();
int y=obj.nextInt();
ArrayList<String> r=maze(0,0,x,y);
System.out.println(r);

}

public static ArrayList<String> maze(int a,int b, int x, int y)
{
if(a==x && b==y)
{
    ArrayList<String> rres=new ArrayList<>();
    rres.add("");
    return rres;
}
    ArrayList<String> hpath=new ArrayList<>();
    ArrayList<String> vpath=new ArrayList<>();

    if(a<x)          // condition important as diwar na tode 
    // pahele diwar check kari then uski call lagai
    {
        vpath=maze(a+1,b,x,y);
    }
    if(b<y)     // condition important as diwar na tode 
    // pahele diwar check kari then uski call lagai
    {
        hpath=maze(a,b+1,x,y);
        
    }
    ArrayList<String> res=new ArrayList<>();
    for(String s:hpath)
    {
        res.add('h'+s);
    }
    
    for(String s:vpath)
    {
        res.add('v'+s);
    }
    return res;

}


}