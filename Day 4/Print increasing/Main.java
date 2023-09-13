import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
         int a= obj.nextInt();
         printd(a,1);
         System.out.println("END");
    }

    static void printd(int a,int b)
    {

        if(b<=a){
        System.out.println(b);
        printd(a,b+1);
        }
    }
    
}