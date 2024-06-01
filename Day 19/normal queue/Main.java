import java.util.*;

class Main{
  static class Queue
  {
    int arr[];
    int size=0;
    int front=0;

    public Queue(int n)
    {
      arr=new int [n];
    }

    public void add(int num)
    {
      if(size>=arr.length)
      {
        System.out.println("overflow");
        return;
      }
      arr[(front+size)%arr.length]=num;
      size++;

    }

    public int remove()
    {
      if(size<=0)
      {
        System.out.println("underflow");
        return -1;
      }
      int val=arr[front];
      front=(front+1)%arr.length;
      size--;
      return val;
    }

    public int peek()
    {
      if(size<=0)
      {
        System.out.println("underflow");
        return -1;
      }
      else if(size>=arr.length)
      {
        System.out.println("overflow");
        return -1;
      }

      int val=arr[front];
      
      return val;
    }

    public int size()
    {
      return size;
    }
    
    public void display()
    {
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[front]+"-> ");
        front=(front+1)%arr.length;
      }
    }


    }

  
  public static void main(String Args[])
  {

  Scanner obj=new Scanner(System.in);
  
  Queue q=new Queue(5);
  q.add(1);
  q.add(2);
  q.add(3);
  q.add(4);
  q.add(5);
  q.add(6);
 System.out.println("removed:"+q.remove());  
 System.out.println("removed:"+q.remove());  
 System.out.println("removed:"+q.remove());  
 System.out.println("peek:"+q.peek());  
 q.add(35);
 System.out.println(q.size());  
  q.display();  

  }
}