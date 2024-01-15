import java.util.*;

class Main{
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
ArrayList <String> r=getstair(n);
System.out.println(r);
}

public static ArrayList<String> getstair(int n)
{
    if(n==0){         // iss test me yeh hai ki 0 se 0 jane ke liye kitne raste hai? toh meaning ki chalo hi mat.  0 pe toh choixe hau ki mat chalo
   ArrayList<String> re=new ArrayList<>();
   re.add("");
   return re;
    }
    if(n<0){      // iss case me yeh hai ki 0 se niche pauch gaye toh vaha se upar thodi jump mar sakte toh khal. but 0 se niche pauch ke kuch nahi kar sakte aap
   ArrayList<String> re=new ArrayList<>();  
   
   return re;
    }

ArrayList<String> ans1=getstair(n-1);
ArrayList<String> ans2=getstair(n-2);
ArrayList<String> ans3=getstair(n-3);

ArrayList<String> fans=new ArrayList<>();

for(String a:ans1)
{
    fans.add(1+a);
}
for(String a:ans2)
{
    fans.add(2+a);
}
for(String a:ans3)
{
    fans.add(3+a);
}

return fans;

}

}