// Queue (java me isse Deque kehte hai) is interface in Java toh seedha implement nahi hoti like linkedlist ya stack ki tarah
// toh iss interface ko class linkedlist ya ArrayDeque use karke implement karna hai

// vaise ArrayDeque is faster due to : memory space kam leti hai, continous memory allocation hai toh operations me fast hoti hai as it uses resizable array internally.

// vaise linkedlist uses double linkedlist internally, can conatin null item values, better operations in middle of the list, but addition storage head as next and previous store karta hai....

import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
// Queue<Integer> q=new LinkedList<>(); // Implemetaion 1

Queue<Integer> q=new ArrayDeque<>();   // Implementaion 2
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.add(6);
System.out.println("Removed: "+ q.remove());
System.out.println("Removed: "+ q.remove());
System.out.println("Removed: "+ q.remove());


q.add(49);

System.out.println("Top: " +q.peek());
q.add(56);
}
}