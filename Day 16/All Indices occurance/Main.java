import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

int arr[]={1,2,3,6,5,8,5,6,3,4,9,7,2};
int target=obj.nextInt();

int sol[]=allIndices(arr,0,0,target);

for(int i=0;i<sol.length;i++)
{
System.out.println(sol[i]);
}

}

public static int [] allIndices(int arr[], int n, int c, int x)
{
    if(n==arr.length)
    {
        int sol[]=new int [c];
        return sol;
    }

    if(arr[n]==x)
    {
        c++;
    }
    int sol[]=allIndices(arr,n+1,c,x);

    if(arr[n]==x)
    {
        sol[c-1]=n+1;
    }

    return sol;
}

}