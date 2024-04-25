import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int arr[]={1,5,6,8,3,5,9,2,5,4,7,3,6,8,4};
System.out.println("enter no you wanna search its first occurance in array");
int n=obj.nextInt();
int res=oc(arr,n,0);
System.out.println("number occur @:"+(++res));
}

public static int oc(int arr[], int x, int n )
{  if(n==arr.length-1)
{
    return -1;
}

    if(arr[n]==x)
    {
        return n;
    }

    int res=oc(arr,x,n+1);
    return res;
}
}