import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
         int a= obj.nextInt();
         int f =fact(a);
         System.out.println(f);
    }
    
    static int  fact(int a)
    {
       int r=1;
        if(a!=1)
        {
            r=a*(fact(a-1));

        }
        return r;
    }
    
}