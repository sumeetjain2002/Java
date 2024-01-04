import java.util.*;
class Main{
    public static void main(String [] args)
    {
        // Implementing Recursion in arrays
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=obj.nextInt();

        int arr[]=new int [n];

        System.out.println("Enter Elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        // pi(arr,0);
        // pd(arr,0);
        //int res=max(arr,0);
        System.out.println("Max is "+ res);


}

 public static void pi(int arr[], int idx)
 {
    //print array
    if(idx==arr.length)
    {
        return;
    }

    System.out.println(arr[idx]);
    pi(arr,idx+1);
 }

 public static void pd(int arr[],int idx)
 { // print array in reverse
    if(idx==arr.length)
    {
        return;
    }

    pd(arr,idx+1);
    System.out.println(arr[idx]);
 }

 public static int max(int arr[],int idx)               // print max element of array
 {
    if(idx==arr.length-1)                    
    {
      return arr[idx];
    }
   int n=max(arr,idx+1);
   if(n>arr[idx])
   {
    return n;
   }
   else {
    return arr[idx];
   }
 }
}