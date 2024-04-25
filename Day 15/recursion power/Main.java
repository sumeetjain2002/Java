import java.util.*;

class Main{
public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Value ");
        int a=obj.nextInt();
        System.out.println("Enter Value of power ");
        int n=obj.nextInt();
        int res=pow(a,n);
        System.out.println(res);

    }

    public static int pow(int a,int n)
    {  
        if(n==1)
        {
            return a;
        }
        int res=a*pow(a,n-1);
        return res;
    }
}