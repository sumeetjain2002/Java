import java.util.*;

class Main{
  
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
          this.data=data;
        }
    }

    public static class LinkedList
    {
        Node head;
        Node tail;
        int size;
        LinkedList()
        {
            head=tail=null;
            size=0;
        }

        public  void addfirst(int data)
        {
            Node temp=new Node(data);
            
            temp.next=head;
            head=temp;
            if(size==0)
            {
                tail=temp;
            }

            size++;
        }

        public void addLast(int data)
        {
            Node temp=new Node(data);
            temp.next=null;
            tail.next=temp;
            tail=temp;

            if(size==0)
            {
                head=temp;
            }
            size++;
        }

        public void atIndex(int data, int id)
        {
            if(id==0)
            {
                addfirst(data);
            }

            if(id==size)
            {
                addLast(data);
            }
            else
            {
            Node ptr=head;
            Node temp=new Node(data);
            while(id!=1)
            {    id--;
                ptr=ptr.next;
            }

            temp.next=ptr.next; 
            ptr.next=temp;
            size++;
            }
        }

        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    }

    public static void main(String [] args)
    {
      Scanner obj=new Scanner(System.in);
      LinkedList ll=new LinkedList();
      ll.addfirst(10);
      ll.addfirst(20);
      ll.addLast(50);
      ll.addLast(100);
      ll.atIndex(65,3);
      ll.display();

    }

   
}