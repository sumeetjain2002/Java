import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=obj.next();
        permutations(s,"");
    }
    public static void permutations(String s, String res)
    {
        if(s.length()==0)
        {
            System.out.println(res);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            String roq=s.substring(0,i)+s.substring(i+1);
            permutations(roq,res+a);
        }
        return;

    }
}