import java.util.*;
class Main
{   
    static void compress1(String a)
    {
      String r=""+a.charAt(0);
      for(int i=0;i<a.length()-1;i++)
      {
       if(a.charAt(i)!=a.charAt(i+1))
       {
        r=r+a.charAt(i+1);
       }
      }
      System.out.println("Result of compress1: "+r);
    }
    static void compress2(String a)
    {
      String r=""+a.charAt(0);
      int count=1;

      for(int i=0;i<a.length()-1;i++)
      {
       if(a.charAt(i)!=a.charAt(i+1))
       {
        if(count==1)
        {
            r=r+a.charAt(i+1);
        }
        else
        r=r+(count)+a.charAt(i+1);
        count=1;
       }
       else{
        count++;
       }
      }
      r+=count;
      System.out.println("Result of compress2: "+r);
    }


    public static void main(String [] args)
    {
        
        System.out.println("Enter a String :");
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        compress1(a);
        compress2(a);
        
        
    }

}