import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String a=obj.next();
        
        func ob=new func();       // class object bhi bana ke dekh liya hai fo practice of OOPS

        ob.s=a;
        String r=ob.solve();
       
        System.out.println("String no is: "+ r);

    }
}

class func
{
    String s;
    String r="";

    String solve()
    {
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a>='a' && a<='z')
            {
                a-=32;
            }
            else
              a+=32;
              r+=a;
        }

        return r;              

    }
}