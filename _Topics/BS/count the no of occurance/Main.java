import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int arr[]={1,2,2,2,3,4,5,5,5,6,7,7,8,8,65,98};

int a=obj.nextInt();

int f=fs(arr,a);
int l=ls(arr,a);

f=l-f+1;
System.out.println("occurance is :"+f);

}

public static int fs(int [] arr, int x)
{
    int res=-1;
    int s=0;
    int e=arr.length-1;
    int mid;

    while(s<=e)
    {
     mid=s+((e-s)/2);

     if(x==arr[mid])
     {
        res=mid;
        e=mid-1;
     }

     else if(x<arr[mid])
     {
        e=mid-1;
     }
     else{
        s=mid+1;
     }

    }
    return res;
}

public static int ls(int [] arr, int x)
{
    int res=-1;
    int s=0;
    int e=arr.length-1;
    int mid;

    while(s<=e)
    {
     mid=s+((e-s)/2);

     if(x==arr[mid])
     {
        res=mid;
        s=mid+1;
     }

     else if(x<arr[mid])
     {
        e=mid-1;
     }
     else{
        s=mid+1;
     }

    }
    return res;
}
}