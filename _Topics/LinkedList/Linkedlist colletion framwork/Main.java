import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);

LinkedList<Integer> ll=new LinkedList<>();

ll.addFirst(48);
ll.addFirst(56);
ll.addLast(65);
System.out.println(ll);
int a=ll.get(2);
System.out.println(a);
System.out.println(ll.size());
ll.remove(2);
System.out.println(ll);

}
}