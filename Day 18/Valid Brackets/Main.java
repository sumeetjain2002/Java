import java.util.*;

public class Main
{  
    

    public static void main(String[] args)
        {
     Scanner obj=new Scanner(System.in);
      String a=obj.next();
      System.out.println(Valid(a));
        }
    public static boolean Valid(String a)
       {

            Stack <Character> s=new Stack<>();
           
            for(int i=0;i<a.length();i++)
            {
                char c=a.charAt(i);
                if(c==')')
                {
                
                if(s.peek()=='(')
                {
                    return false;
                }
                else{
                    while(s.peek()!='(')
                    {
                        s.pop();
                    }
                    s.pop();
                }
                }
                else
                {
                    s.push(c);
                }
               
            }

            return true;
        }

   
}