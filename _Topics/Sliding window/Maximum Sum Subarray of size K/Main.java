import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

int arr[]= {1,2,6,5};

int k=2;

int s=0;
int e=0;

int sum=0;
int res=Integer.MIN_VALUE;

while(e<arr.length)
{ 

   if(e-s+1<k)
   { 
    sum=sum+arr[e];
    e++;
    
   }
   else 
   {
   
    sum+=arr[e];

    if(res<sum)
     {
        res=sum;
     }
     
     e++;
     
     sum-=arr[s];
     s++;
   }
}

System.out.println("Sum is "+ res);
}
}