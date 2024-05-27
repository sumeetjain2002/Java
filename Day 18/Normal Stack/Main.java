import java.util.*;

class Main{

static class Cstack
{
    int data[];
    int p;

    public Cstack(int size)
    {
        data=new int [size];
        p=-1;
    }
 
    public int size()
    {
        return data.length;
    }

    public int peek()
    {
        if(p<data.length){
        return data[p];}
        else{
            return -1;
        }
    }

    public void push(int a){
        p++;
        data[p]=a;

    }

    public int pop()
    {
        p--;
        return data[p+1];

    }
    public void display()
    {
        for(int a:data)
        {
            System.out.print(a+"->");
        }
    }

}
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

Cstack s=new Cstack(5);
s.push(5);
s.push(4);
s.push(3);
s.push(2);
s.push(1);
System.out.println(s.peek());
s.display();


}
}

