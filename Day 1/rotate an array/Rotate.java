import java.util.Scanner;
class Rotate
{
    static void rotate(int arr[], int x)
    {
      reverse(arr,0,arr.length-1);
      reverse(arr,0,x-1);
      reverse(arr,x,arr.length-1);
    }
    static void reverse(int arr[], int s , int e)
    {
        while(s<e)
        {
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
            }
    }

    
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        System.out.println();

        System.out.println("Enter a rotation number");
        
        
        int x=obj.nextInt();
        int n=arr.length;
        x=x%n;
        if(x<0)
        {
          x+=n;
        }
        rotate(arr,x);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}