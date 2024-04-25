import java.util.*;

public class Main 
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Value for factorial");
        int a=obj.nextInt();
        int res=fact(a);
        System.out.println(res);

    }

    public static int fact(int a)
    {
        if(a==1)
        {
            return 1;
        }
        int res=a*fact(a-1);
        return res;
    }
}


