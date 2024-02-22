import java.util.*;

class Main{
// List <List<String>> answer= new ArrayList<>();
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int count=0;
char chess[][]=new char[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++)
    {
        chess[i][j]='.';
    }
}

count=queenPlace(chess,0);
System.out.print(count);

}

public static int queenPlace(char chess[][], int row )
{  if(row==chess.length)
{   
    return 1; 
}

int count=0;
  for(int i=0;i<chess.length;i++)
  {
    if(isSafe(chess,row,i))
    {
        chess[row][i]='Q';
        count+=queenPlace(chess,row+1);
        chess[row][i]='.';
    }
  }
  return count;
}

public static boolean isSafe(char chess[][], int row, int col)
{
    for(int i=row-1;i>=0;i--)
    {
        if(chess[i][col]=='Q')
        {
            return false;
        }
    }

    for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j--)
    {
        if(chess[i][j]=='Q')
        {
            return false;
        }
    }

    for(int i=row-1, j=col+1;i>=0 && j<chess.length;i--,j++)
    {
        if(chess[i][j]=='Q')
        {
            return false;
        }
    }
    return true;
}

}