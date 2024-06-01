import java.util.*;

class Main{
    static class Adaptor
    {
        Queue <Integer> main;
        Queue <Integer> help;

        public Adaptor()
        {
            main=new ArrayDeque<>();
            help=new ArrayDeque<>();
        }

        public void push(int a)
        {
           main.add(a);
        }

        public int pop()
        {
         if(main.size()<=0)
         {
            System.out.println("underflow");
            return -1;
         }
         System.out.println("before main: "+main);
         for(int i=0;i<main.size();i++)
         {
            int val=main.remove();
            help.add(val);
         }
         System.out.println("mid main: "+main);
         System.out.println("mid help: "+help);
         int val=main.remove();
        
         Queue<Integer> temp=main;
         main=help;
         help=temp;
         System.out.println("after main: "+main);
         System.out.println("help: "+help);
         return val;
        }

        public int peek()
        {
          if(main.size()<=0)
         {
            System.out.println("underflow");
            return -1;
         }

         for(int i=0;i<main.size()-1;i++)
         {
            int val=main.remove();
            help.add(val);
         }
         int val=main.remove();
         help.add(val);
         Queue<Integer> temp=main;
         main=help;
         help=temp;
         
         return val;

        }

        public int size()
        {
          return main.size();
        }

        public void display()
        {
         for(int a:main)
         {
            System.out.print(a+"-> ");
         }
         System.out.println();
        }
    }
    public static void main(String Args[])
        {

        Scanner obj=new Scanner(System.in);
        Adaptor a=new Adaptor();

        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.push(50);
        System.out.println(a.peek());
        System.out.println(a.size());
        a.display();
        System.out.println(a.pop());
        a.display();



        }
}