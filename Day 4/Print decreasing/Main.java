import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
         int a= obj.nextInt();
         printd(a);
         System.out.println("END");
    }

    static void printd(int a)
    {

        if(a>0){
        System.out.println(a);
        printd(a-1);
        }
    }
    
}