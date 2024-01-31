import java.util.*;

class Main{

public static Stack<Integer> bpush(Stack<Integer> s,int data)
{
    if(s.isEmpty())
    {
        s.push(data);
        return s;
    }

int top=s.pop();
s= bpush(s,data);
s.push(top);
return s;
}
    
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
Stack <Integer> s=new Stack<>();

s.push(1);
s.push(3);
s.push(5);
s.push(7);

System.out.println("Enter number to push at bottom");
int a=obj.nextInt();

s=bpush(s,a);

while(!(s.isEmpty()))
{
    int res=s.peek();
    System.out.println(res);
    s.pop();
}



}
}