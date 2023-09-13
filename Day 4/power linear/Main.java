import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
         int n= obj.nextInt();
         System.out.println("Enter a number");
         int x= obj.nextInt();

         int r=printd(n,x);
         System.out.println(r);
    }

    static int printd(int n,int x)
    {
        if(x==0)
        {
            return 1;
        }
        int ans=n*(printd(n,x-1));
        return ans;
    }
    
}