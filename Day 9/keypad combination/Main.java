import java.util.*;

class Main{
public static void main(String Args[])
{
Scanner obj=new Scanner(System.in);
String s=obj.nextLine();
ArrayList <String> res=keypad(s);
System.out.println(res+" "+res.size());

}
static String code[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

public static ArrayList<String> keypad(String s)
{
    if(s.length()==0)
    {
        ArrayList<String> res=new ArrayList<>();
        res.add("");
        return res;
    }
  char a=s.charAt(0);
  s=s.substring(1);
  ArrayList<String> rr=keypad(s);
  ArrayList<String> res=new ArrayList<>();
 
  String w=code[a-'0'];
  for(int i=0;i<w.length();i++){
    char si=w.charAt(i);
    for(String z:rr)
    {
        res.add(si+z);
    }

  }
  return res;
}

}