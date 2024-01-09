import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int f=obj.nextInt();
int arr[]=new int[f];
System.out.println("Enter Elements in array");
for(int i=0;i<arr.length;i++)
{

arr[i]=obj.nextInt();

}

System.out.println("Enter target");
int x=obj.nextInt();
// int res=fo(arr,x,0);
//int res=lo(arr,x,0);
int a[]=all(arr,x,0,0);
for(int i=0;i<a.length;i++)
{
    System.out.println("Sol is "+a[i]);
}

}

public static int fo(int arr[], int t, int id)      // first ocurance code with better approach
{
    int res;
 if(id==arr.length)
 {
    return -1;
 }
 if(arr[id]==t)
 {
    return id;                                 
 }
 else{
    res =fo(arr,t,id+1);
 }
 return res;
}

public static int lo(int arr[], int t, int id)      // last occurance 
// pahele sabse last me pauche and initalize ans with -1 ki mila nahi then aate aate agar abhi tak nahi mila toh chcek karenge and assign kara denge varna -1 ko hi chalne denge 😊
{
    if(id==arr.length)
    {
        return -1;
    }
    int ans=lo(arr,t,id+1);
    if(ans<0)
    {
        if(arr[id]==t){
            ans=id;
        }
        else {
            return ans;
        }
    }
    return ans;
}

// found all indices
public static int [] all(int arr[], int t, int id, int c)
{
    if(id==arr.length)
    {
        int sol[]=new int [c];
        return sol;
    }
    if(arr[id]==t)
    {
        c++;
    }
    int sol[]=all(arr,t,id+1,c);
    if(arr[id]==t)
    {
        sol[c-1]=id;
        c--;
    }
    return sol;
}


}