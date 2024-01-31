import java.util.*;

class Main{

public static Stack<Integer> reverse(Stack<Integer> s)
{
if(s.isEmpty())
{
    Stack<Integer> em=new Stack<>();
    return em;
}

int top=s.pop();;
s=reverse(s);
s=bpush(s,top);
return  s;

}

public static Stack<Integer> bpush(Stack<Integer> s, int data)
{  if(s.isEmpty())
{
    s.push(data);
    return s;
}
   int top=s.pop();
   s=bpush(s,data);
   s.push(top);
   return s;
}



public static void main(String Args[])
{
 
Scanner obj=new Scanner(System.in);
Stack <Integer> s=new Stack<>();
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(5);

s=reverse(s);
while(!(s.isEmpty()))
{
    int ele=s.peek();
    System.out.println(ele);
    s.pop();
}

}
}