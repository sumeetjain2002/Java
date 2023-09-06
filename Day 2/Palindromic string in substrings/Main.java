import java.util.*;
class Main
{
    static boolean ispalindromic(String a)
    {
      int s=0;
      int e=a.length()-1;
      while(s<e)
      {
        if(a.charAt(s)!=a.charAt(e))
        {
           return false;
        }
        s++;
        e--;
      }
      return true;
    }
    static void display(String a)
    {
        System.out.println("String is : "+a);
    }

    public static void main(String [] args){
        System.out.println("Enter a String :");
        Scanner obj=new Scanner(System.in);
        String a=obj.next();

        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++)
            {
               String s=a.substring(i,j);

               boolean r=ispalindromic(s);
                if(r==true)
                {
                    display(s);
                }
            }
        }
    }

}