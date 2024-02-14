import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int n=obj.nextInt();

nqueen(new int [n][n],0,"");
}
public static void nqueen(int chess[][],int r,  String ans)
{
    if(r==chess.length)
    {
        System.out.println(ans);
        
        return;
    }

    for(int i=0;i<chess[0].length;i++)
    {
        if(issafe(chess,r,i))
        {
            chess[r][i]=1;
            nqueen(chess,r+1,ans+r+"-"+i+", ");
            chess[r][i]=0;
        }
    }
}

public static boolean issafe(int chess[][],int r, int c)
{
    for(int i=r-1,j=c;i>=0;i--)
    {
        if(chess[i][j]==1)
        {
            return false;
        }
    }
    for(int i=r-1, j=c-1;i>=0 &&j>=0;i--,j--)
    {
        if(chess[i][j]==1)
        {
            return false;
        }
    }
    for(int i=r-1, j=c+1;i>=0 && j<chess.length;i--,j++)
    {
        if(chess[i][j]==1)
        {
            return false;
        }
    }
    return true;
}
}