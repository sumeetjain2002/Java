import java.util.*;

class Main{
 
 static class Queues
 { static int arr[];
 
static  int rear=0;
    Queues(int size)
    {
     arr=new int [size];
    }
    public static boolean isEmpty()
    {
        if(rear<arr.length)
        {
            return true;
        }
        return false;
    }

    public static void add(int data)
    {
     if(isEmpty())
     {
       arr[rear]=data;
       rear++;
     }
     else
     {
        System.out.println("Queue full");
     }
    }

    public static void remove()
    {
        if(rear==0)
        {
        System.out.println("Queue Empty so cannot remove");
        }
        else{
            System.out.println("removing :"+arr[0]);
            int size=rear;
            for(int i=1;i<size;i++)
            {
              arr[i-1]=arr[i];
              
            }
            rear--;
        }
       
    }

    public static void peek()
    {
        if(rear==0)
        {
           System.out.println("Queue Empty so cannot Peek");  
        }
        else{
            System.out.println(arr[0]);
        }
    }
 }

public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
Queues q=new Queues(6);
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.add(6);
q.remove();
q.remove();
q.remove();

q.add(49);

q.peek();
q.add(56);

}
}