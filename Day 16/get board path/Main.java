import java.util.*;

class Main{

    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter board limit:");
        int limit=obj.nextInt();
        ArrayList<String> res=paths(0,limit);
        System.out.println("Printing all possiblities reach limit by Dice of range 1-6 ");
        System.out.println();
        System.out.println();

        System.out.println(res);
    }

    public static ArrayList<String> paths(int n, int limit)
    {
    if(n>limit)
    {
        return new ArrayList<String>();
    }
    if(n==limit)
    {
        ArrayList<String> ans=new ArrayList<String>();
        ans.add("");
        return ans;
    }
    ArrayList<String> mres=new ArrayList<>();
    
    ArrayList<String> ans1=paths(n+1,limit);
    ArrayList<String> ans2=paths(n+2,limit);
    ArrayList<String> ans3=paths(n+3,limit);
    ArrayList<String> ans4=paths(n+4,limit);
    ArrayList<String> ans5=paths(n+5,limit);
    ArrayList<String> ans6=paths(n+6,limit);

    for(String s:ans1)
    {
        mres.add(1+s);
    }
    for(String s:ans2)
    {
        mres.add(2+s);
    }
    for(String s:ans3)
    {
        mres.add(3+s);
    }
    for(String s:ans4)
    {
        mres.add(4+s);
    }
    for(String s:ans5)
    {
        mres.add(5+s);
    }
    for(String s:ans6)
    {
        mres.add(6+s);
    }

    return mres;
    
   
    }
    }