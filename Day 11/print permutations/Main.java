import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
String s=obj.nextLine();
System.out.println("------------------");
printper(s,"");

}

public static void printper(String qstr, String astr)
{
  if(qstr.length()==0)
  {
    System.out.println(astr);
    return;
  }
  StringBuilder sol=new StringBuilder(qstr);
  for(int i=0;i<qstr.length();i++)
  {
   char c=sol.charAt(i);
   sol.deleteCharAt(i);
   String rem=sol.toString();
   printper(rem,astr+c);

   sol.insert(i,c);

  }
}
}