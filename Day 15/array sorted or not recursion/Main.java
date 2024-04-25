import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int arr[]={1,2,3,4,5,4,7,3,1};
System.out.println("Checking Is sorted or not");

boolean a=sort(arr,0);
System.out.println(a);

}

public static boolean sort(int arr[], int n)
{  if(n==arr.length-1)
    {
        return true;
    }
    boolean res;
    if(arr[n]<arr[n+1])
    {
         res=sort(arr,n+1);
    }
    else
    {
        res=false;
    }

    return res;


}
}