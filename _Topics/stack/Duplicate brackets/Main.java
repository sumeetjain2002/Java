import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
String str=obj.next();

Stack<Character> s=new Stack<>();

for(int i=0;i<str.length();i++)
{
 char a=str.charAt(i);
 if(a==')')
 {
  if(s.peek()=='(')
  {
    System.out.println("false");
    return;
  }
  else{
    while(s.peek()!='(')
    {
        s.pop();
    }
    s.pop();
  }
 }
 else{
    s.push(a);
 }

}
 
 System.out.println("True");


}
}