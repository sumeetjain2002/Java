import java.util.Scanner;
class Subarray
{
    static void subarray(int arr[])
    {
       for(int si=0;si<arr.length;si++)
       {
        for(int ei=si;ei<arr.length;ei++)
        {
            for(int i=si;i<=ei;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
       }
    }
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          System.out.println("Enter Elements of array");
          arr[i]=obj.nextInt();
        }
        subarray(arr);
         
    }
}