import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

int n=obj.nextInt();
int arr[][]=new int [n][n];

int i=obj.nextInt();
int j=obj.nextInt();
int start=1;
knightTour(arr,i,j,start);
}

public static void knightTour(int arr[][], int n, int m, int start)
{   if(n<0 || m<0 || m>=arr.length|| n>=arr.length || arr[n][m]!=0)   // base case
    {
        return;
    }
    
    if(start==arr.length*arr.length)
    {   
        arr[n][m]=start+1;
        for(int i=0;i<arr.length;i++)   // print case at end
        {
        for(int j=0;j<arr.length;j++)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("---------------");
        arr[n][m]=0;
        return;
    }

    
    arr[n][m]=start;
    knightTour(arr,n-2,m+1,start+1); //top right
    knightTour(arr,n-2,m-1,start+1); //top left
    knightTour(arr,n-1,m-2,start+1); //left top
    knightTour(arr,n+1,m-2,start+1); //left down
    knightTour(arr,n+2,m-1,start+1); //down left
    knightTour(arr,n+2,m+1,start+1); //down right
    knightTour(arr,n+1,m+2,start+1); //right down
    knightTour(arr,n-1,m+2,start+1); //right top
    arr[n][m]=0;
}
}