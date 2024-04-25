import java.util.*;

class Main{

    public static void main(String Args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=obj.next();

        ArrayList<String> ans=perma(s);
        System.out.println(ans);
    }

    public static ArrayList<String> perma(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        char c=s.charAt(0);
        s=s.substring(1);
        ArrayList<String> rres=perma(s);
        ArrayList<String> res=new ArrayList<>();
        for(String sol:rres)
        {
            for(int i=0;i<=sol.length();i++)
            {
             String sol1=sol.substring(0,i)+c+sol.substring(i);
             res.add(sol1);
            }
        }

        return res;
    }
}