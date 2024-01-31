import java.util.*;

class Main{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

  static class Ll
  {
   Node head;
   Node tail;
   int size;

   Ll()
   {
    head=tail=null;
    size=0;
   }

   public  void addfirst(int data)
   {
    Node temp=new Node(data);
    if(size==0)
    {
        head=tail=temp;
        temp.next=null;
    }
    else {temp.next=head;
     head=temp;}

     size++;
   }

   public void addlast(int data)
   {
    if(size==0)
    {
        addfirst(data);
    }
    else{
    Node temp=new Node(data);
    temp.next=null;
    tail.next=temp;
    tail=temp;
    size++;
   }
   }

   public  void addmid(int data, int idx)
   {
   Node temp=new Node(data);
   Node ptr=head;
   while(idx>1)
   {
    ptr=ptr.next;
    idx--;
   }
   temp.next=ptr.next;
   ptr.next=temp;
   size++;

   }
   public static void rfirst(int data)
   {
    
   }

   public static void rlast(int data)
   {
    
   }

   public static void rmid(int data, int idx)
   {

   }
   public  void metric()
   {
    System.out.println("head is:"+head.data);
    System.out.println("tail is:"+tail.data);
    System.out.println("Size is:"+size);
   }
  }

  public static void main(String Args[])
  {

 Scanner obj=new Scanner(System.in);

 Ll list=new Ll();
 list.addfirst(23);
 list.addfirst(96);
 list.addfirst(86);
 list.addlast(52);
 list.addfirst(85);
 list.addlast(22);
 list.addlast(48);
 list.addmid(63,3);
 list.metric();
 

}

}