import java.util.*;

class Main{
    public static class Stacks
    {
        LinkedList <Integer> ll=new LinkedList<>();

        public void push(int a)
        {
            ll.addFirst(a);
        }

        public int pop()
        {
          return ll.removeFirst();
        }

        public int peek()
        {
        return ll.getFirst();
        }

        public int size()
        {
        return ll.size();
        }

        public void disp()
        {
            System.out.println(ll);
        }
    }

    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        Stacks s=new Stacks();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.disp();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.disp();

        


    }
}