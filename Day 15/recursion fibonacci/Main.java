import java.util.*;

class Main{
public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Value ");
        int a=obj.nextInt();
        int res=fib(a);
        System.out.println(res);

    }

    public static int fib(int n)
    {  if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }

        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int res=fib1+fib2;
        return res;
    }
}