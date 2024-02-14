import java.util.*;

class Main{
public static void main(String Args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter n");
int n=obj.nextInt();
System.out.println("enter m");
int m=obj.nextInt();

int arr[][]=new int [n][m];

for(int i=0;i<n;i++)
{
 for(int j=0;j<m;j++)
 {
  arr[i][j]=obj.nextInt();
 }
}

floodfill(arr,0,0,"",new boolean [n][m]);   // default value in bool array is false
}

public static void floodfill(int maze[][],int row, int col,String ans,boolean flag[][])
{
 if(row==maze.length-1 && col==maze[0].length-1)
    {
        System.out.println(ans);
        
        return;
    }

    if(row<0 ||col<0 || row>=maze.length|| col>=maze[0].length || maze[row][col]==1|| flag[row][col] )
    {
        return;
    } 

    

    

flag[row][col]=true;
floodfill(maze,row-1,col,ans+'t',flag);
floodfill(maze,row,col-1,ans+"l",flag);
floodfill(maze,row+1,col,ans+"d",flag);
floodfill(maze,row,col+1,ans+"r",flag);
flag[row][col]=false;

}
}