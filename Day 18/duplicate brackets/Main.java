import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();

        System.out.println(Duplicate(s));
    }
    public static boolean Duplicate(String s)
    {
        Stack <Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='(' || c=='{' ||c=='[')
            {
                st.push(c);
            }
            else if(c==')' || c=='}' ||c==']')
            {
               if(st.size()==0){
                return false;
               }
               else if(st.peek()=='(' && c==')')
               {
                st.pop();
               }
               else if(st.peek()=='[' && c==']')
               {
                st.pop();
               }
               else if(st.peek()=='{' && c=='}')
               {
                st.pop();
               }
               else{
                return false;
               }
            }
        }

        if(st.size()==0)
        {
            return true;
        }

        return false;
    }
}