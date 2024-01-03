import java.util.*;
class Main
{
    public static void main (String [] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("enter number");
       int n=obj.nextInt();
       toh(n,10,11,12);
    }

    public static void toh(int n, int a, int b, int c)
    {
        if(n==0)
        {
            return;
        }
        toh(n-1,a,c,b);                                // tower of hanoi main algo of three lines
        System.out.println(n+" Move from "+a+" to "+b);// tower of hanoi main algo of three lines
        toh(n-1,c,b,a);                                // tower of hanoi main algo of three lines
    }
}