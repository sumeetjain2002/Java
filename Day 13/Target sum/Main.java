import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int arr[]=new int [n];
for(int i=0;i<arr.length;i++)
{

arr[i]=obj.nextInt();

}
int target=obj.nextInt();

targetsum(arr,0,"",0,target);
}

public static void targetsum(int arr[],int idx,String ans, int sum, int target)
{
    if(idx==arr.length)
    {
        if(sum==target)
        {
            System.out.println(ans);
        }
        return;
    }

    if(sum>target)
    {
        return;
    }

    targetsum(arr,idx+1,ans,sum,target);
    targetsum(arr,idx+1,ans+arr[idx]+" ",sum+arr[idx],target);
    
}
}