import java.util.*;
class Reverse
{
    public static void reverse(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
      while(i<j)
      {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

      }
    }
    public static void main(String [] args)
    {
     Scanner obj=new Scanner(System.in);
     int arr[]={1,2,3,4,5,6};
     reverse(arr);
     for(int i=0;i<arr.length;i++){
     System.out.print(arr[i]+" ");
     }
    }
}