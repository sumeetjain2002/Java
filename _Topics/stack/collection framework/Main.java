import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
Stack <Integer> s=new Stack<>();

s.push(1);
s.push(2);
s.push(3);
s.push(5);
s.push(85);

System.out.println(s.peek());

s.pop();
s.pop();
s.pop();
System.out.println(s.peek());
boolean flag=s.isEmpty();
System.out.println(flag);

}
}