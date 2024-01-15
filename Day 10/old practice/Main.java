// first occurance 
// last occurance 
// print all indexes
import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int arr[]={2,3,2,6,8,6,4,5,6,2,9};
System.out.println("Enter no want to find");
int x=obj.nextInt();
// int res=fi(arr,x,0);
// int res=li(arr,x,0);
ArrayList<Integer> res=alli(arr,x,0);
System.out.println(res+"  "+res.size());
}

// public static int fi(int arr[],int x,int s) //
// {
//   if(s==arr.length){
//     return -1;
//   }

//   if(arr[s]==x)
//   {
//     return s;
//   }
//   int res=fi(arr,x,s+1);
//   return res;
// }

// public static int li(int arr[], int x, int s)

// {
//     if(s==arr.length)
//     {
//         return -1;
//     }
//     int res=li(arr,x,s+1);

//     if(res<0){
//         if(arr[s]==x)
//     {
//        res=s;
//     }
//     }
    
//         return res;
//     }
static ArrayList<Integer> res=new ArrayList<>();
public static ArrayList<Integer> alli(int arr[], int x, int s)
{
    if(s==arr.length)
    {
          return res;
    }
    
    if(arr[s]==x)
    {
    res.add(s+1);
    }
    alli(arr,x, s+1);
    return res;
}

}