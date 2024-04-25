import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int arr[]={1,5,4,5,6,7,7,7};
System.out.println("enter no you wanna search its last occurance in array");
int n=obj.nextInt();
int res=loc(arr,n,0);
System.out.println("number occur @:"+(++res));
}

public static int loc(int arr[], int x, int n )
{  if(n==arr.length)
{
    return -1;
}

   int res= loc(arr,x,n+1);
   if(res==-1 &&arr[n]==x)
   {
    res=n;
   }

   return res;


}
}