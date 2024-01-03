import java.util.*;
class Main
{
    public static void main(String [] args)
    {
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter Number");
         int x=obj.nextInt();
         System.out.println("Enter Power");
         int n=obj.nextInt();
        //  int res=pl(x,n); // power logarathimic sol
         zz(x);
         System.out.println("Ans  ");
    }
    public static int pl(int x, int n )
    {
        if(n==0)
        {
            return 1;
        }
        int xp=pl(x,n/2);
        int res=xp*xp;
        
        if(n%2==1)
        {
            res=res*x;
        }
        return res;
    }

    public static void zz(int n)
    { if(n==0)
    {
        return;
    }
     System.out.println("Pre "+n);                                 // It is to understand recursion and stack calls deeply see euler diagram for more clarity.
     zz(n-1);
     System.out.println("During 1 "+n);
     zz(n-1);
     System.out.println("During 2 "+n);
     zz(n-1);
     System.out.println("Post"+n);
    }
}

