import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter string:");
        String a=obj.next();
        ss(a,"");

    }

    public static void ss(String s, String res)    // without ArrayList
    {
        if(s.length()==0)
        {
            System.out.println(res);
            return;
        }

        char a=s.charAt(0);
        s=s.substring(1);
        ss(s,res+a);
        ss(s,res+"-");
        return;
    }
}