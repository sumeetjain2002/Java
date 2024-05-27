import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Board Size:");
        int a=obj.nextInt();
        printWays(a,"",0);

    }

    public static void printWays(int limit,String ans,int counter)
    {
        if(counter>limit)
        {
            return;
        }

        if(counter==limit)
        {
            System.out.println(ans);
        }

        printWays(limit,ans+"1",counter+1);
        printWays(limit,ans+"2",counter+2);
        printWays(limit,ans+"3",counter+3);
        printWays(limit,ans+"4",counter+4);
        printWays(limit,ans+"5",counter+5);
        printWays(limit,ans+"6",counter+6);
        return ;
    }
}