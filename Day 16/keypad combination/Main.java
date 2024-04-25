import java.util.*;

class Main{
    
    static String list[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String Args[])
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a number");
    String a=obj.next();
    ArrayList<String> ans=keypadCombo(a);
    System.out.println(ans);

    }

    public static ArrayList<String> keypadCombo(String a)
    {
        if(a.length()==0)
        {
            ArrayList <String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        char c=a.charAt(0);
        a=a.substring(1);
        ArrayList <String> ans=new ArrayList<>();
        String p1=list[c-'0'];
        ArrayList<String> rres=keypadCombo(a);
        while(p1.length()!=0)
        {
            char c1=p1.charAt(0);
            p1=p1.substring(1);
            for(String sol1:rres)
            {
                ans.add(c1+sol1);
            }
        }

        return ans;
    }
}