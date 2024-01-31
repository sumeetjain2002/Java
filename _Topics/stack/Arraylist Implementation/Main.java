import java.util.*;

class Main{

   static class Stacks
    {  
       static ArrayList<Integer> list=new ArrayList<>();

        public boolean isEmpty()
        {
            if(list.size()==0)
            {
               
                return true;
            }
            return false;
        }

        public  void push(int data)
        {
            list.add(data);
        }

        public void pop()
        {
            if(isEmpty())
            {
               System.out.println("Cannot pop as stack is empty");
            }
            else
            {
                
                list.remove(list.size()-1);
            }
        }
        public  void peek()
        {
            if(isEmpty())
            {
               System.out.println("Cannot Peek as stack is empty");
            }
            else
            {
                int top=list.get(list.size()-1);
                System.out.println("Element at top is :"+top);
            }
        }
    }
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

Stacks s=new Stacks();

s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.push(80);
s.pop();
s.peek();
s.pop();
s.pop();
s.pop();
s.pop();

s.peek();
s.pop();

}
}