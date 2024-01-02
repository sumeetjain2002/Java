import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        // Recursion module practice 
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=obj.nextInt();
        System.out.println("Enter its power");
        int x=obj.nextInt();
        // pd(a);
        // pi(a);
        // pdi(a);
         int res=0;
        //  res=fact(a);
         
        res=pl(a,x);
        System.out.println(res);
    }

    public static void pd(int a)
    {
        if(a==0){
            return;
        }
        System.out.println(a);
        pd(a-1);
    }

    public static void pi(int a)
    {
        if(a==0)
        {
            return;
        }
        pi(a-1);
        System.out.println(a);

    }
    public static void pdi(int a)
    {
        if(a==0)
        {
            return;
        }
        System.out.println(a);
        pdi(a-1);
        System.out.println(a);
    }
    public static int fact(int a)
    {
        if(a==1){
            return 1;
        }
      int res=a*fact(a-1);
      return res;
    }

    public static int pl(int a, int x)
    {
        if(x==1)
    {
        return a;
    }
        int res=a*(pl(a,x-1));
        return res;
    }
}