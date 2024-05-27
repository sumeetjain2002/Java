import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=obj.nextInt();
        paths(0,0,n,"");
        

    }

    public static void paths(int r, int c, int n,String ans)
    {
        if(r>=n ||c>=n)
        {
            return ;
        }

        if(r==n-1 && c==n-1)
        {
            System.out.println(ans);
            return ;
        }

        paths(r+1,c,n,ans+"v");
        paths(r,c+1,n,ans+"h");
        paths(r+1,c+1,n,ans+"d");

        
    
        return ;

    }
}