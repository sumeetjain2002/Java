import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
Stack <Character> s =new Stack<>();

String a=obj.next();

for(int i=0;i<a.length();i++)
{
    char c=a.charAt(i);
    if(s.isEmpty() &&( c=='}'|| c==']'|| c==')'))
    {
        System.out.println("false");
        return;
    }
    if(c=='{' ||c=='[' ||c=='(')
    {
        s.push(c);
    }
    else if(c=='}'|| c==']'|| c==')')
    {
        if(s.peek()=='{' && c=='}')
        {
            s.pop();
        }
        else if(s.peek()=='[' && c==']')
        {
            s.pop();
        }
        else if(s.peek()=='(' && c==')')
        {
            s.pop();
        }
        else {
            System.out.println("False");
            return;
        }
    }
}
System.out.println(s.isEmpty());
return;
}
}