import java.util.*;
class Main{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of 2 D array");
        int n=obj.nextInt();
        System.out.println("Enter size of 2 D array");
        int m=obj.nextInt();
        int arr[][] =new int [n][m];
        System.out.println("Enter Elements in array");
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
             arr[i][j]=obj.nextInt();
            }
        }
   System.out.println("=========================");

   