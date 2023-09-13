// program to remove prime no. from array list without affecting order of arraylist

import java.util.*;
class Main
{
    static boolean isprime(int n)
    {
          
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main (String [] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList< Integer> list=new ArrayList<>();   // crating array list
        System.out.println("Enter elements in array list and press -1 for quit inserting");
        int i=0;
        while(i>=0)
        {
            int a=obj.nextInt();
            if(a==-1)
            {
                break;
            }
            else
            {
            list.add(a);
            i++;
            }
        }   
        System.out.println(list) ;
        for( i=0;i<list.size();i++)
        {   
              
            int e=list.get(i);
              
            boolean r=isprime(e);
             if(r)
             {
                list.remove(i);
                i--;
             }
        }
          System.out.println("List without prime -- "+ list) ;
       
        
    }
}