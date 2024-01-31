import java.util.*;

class Main{
 static class Node
 {
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }

 }
    static class Stacks
    {
     Node head;

     public boolean isEmpty()
     {
        if(head==null)
        {
            return true;
        }
        return false;
     }

     public void push(int data)
     {
        Node temp=new Node(data);
        if(isEmpty())
        {
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
     }
     public void pop()
     {
        if(isEmpty())
        {
            System.out.println("Stack already empty so cannot pop");

        }
        else{
            head=head.next;

        }
     }
     public void peek()
     {
        if(isEmpty())
        {
            System.out.println("Stack already empty so cannot peek");

        }
        else{
            System.out.println("At peek :" +head.data);
        }
     }
    }
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
Stacks s=new Stacks();
s.push(1);
s.push(5);
s.push(6);
s.push(7);
s.push(9);
s.peek();
s.pop();
s.peek();

s.pop();
s.pop();
s.pop();
s.peek();
s.pop();
s.pop();
s.peek();


}
}