import java.util.*;

class Main{
    static class Node
    {
    int data;
    Node left;
    Node right;
   
    Node(int data)
    {
        this.data=data;
        left=right=null;

    }
    }

    static class Tree
    { 
        static int idx=-1;
       public static Node build(int arr[])
       {
        idx++;
        if(arr[idx]==-1)
        {
            return null;
        }
        Node temp=new Node(arr[idx]);
        temp.left=build(arr);
        temp.right=build(arr);

        return temp;
       }

       public static void Preorder(Node root)   //Preorder traversal
       {
        if(root==null)
        {
            
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
        
       }

       public static void inorder(Node root)  //inorder traversal
       {
        if(root==null)
       {
        return ;
       }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

       }

       public static void postorder(Node root) //postorder traversal
       {
        if(root==null)
       {
        return ;
       }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
       

       }
    }
public static void main(String Args[])
{

Scanner obj=new Scanner(System.in);
int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
Tree t=new Tree();
Node res=t.build(arr);
System.out.println("Tree head "+res.data);
t.Preorder(res);
System.out.println();
t.inorder(res);
System.out.println();
t.postorder(res);


}
}