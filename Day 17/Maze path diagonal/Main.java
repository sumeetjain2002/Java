import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=obj.nextInt();
        ArrayList<String> res=paths(0,0,n);
        System.out.println(res);

    }

    public static ArrayList<String> paths(int r, int c, int n)
    {
        if(r>=n ||c>=n)
        {
            return new ArrayList<String>();
        }

        if(r==n-1 && c==n-1)
        {
            ArrayList<String> res=new ArrayList<>();
            res.add("");
            return res;
        }

        ArrayList<String> vpaths=paths(r+1,c,n);
        ArrayList<String> hpaths=paths(r,c+1,n);
        ArrayList<String> dpaths=paths(r+1,c+1,n);
        

        ArrayList<String> res=new ArrayList<>();

        for(String a:vpaths)
        {
            res.add("v"+a);
        }
        for(String a:hpaths)
        {
             res.add("h"+a);
        }

        for(String a:dpaths)
        {
             res.add("d"+a);
        }
        return res;

    }
}