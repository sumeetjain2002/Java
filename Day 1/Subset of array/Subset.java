import java.util.*;
class Subset
{
    static void display(String s)
    {
      System.out.println(s);
    }

    public static void main(String [] args)
    { Scanner obj=new Scanner(System.in);
        System.out.println("Enter a array size");
        int n=obj.nextInt();
        char arr[]=new char [n];
        for(int i=0;i<n;i++)
        {
         System.out.println("Enter array elements");
        arr[i]=obj.next().charAt(0); // nextChar jaisi koi chej nahi hoti to sring input ka chat at(0) uthaya
        }
       int ts=(int)Math.pow(2,n);
       
     for(int i=0;i<ts;i++)
     { String s="";
     int c=i;
        for(int j=n-1;j>=0;j--){
         int rem=c%2;
         c/=2;
         if(rem==0)
         {
            s="- "+s;
         }
         else{
             s=arr[j]+" "+s;
         }
     }
     display(s);
     }

    }
}