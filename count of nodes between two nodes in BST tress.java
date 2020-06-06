import java.util.*;

class TestClass {

    static class node{
        int data;
        node left,right;
        node(int data)
         {
             this.data=data;
             left=right=null;
         }
    }
    static node insert(node t,int data)
     {
         if(t==null)
          return new node(data);
          if(t.data<data)
            t.right=insert(t.right,data);
            else if(t.data>data)
             t.left=insert(t.left,data);
            return t;
     }
     static void inorder(node t)
      {
          if(t==null)
           return;
           inorder(t.left);
           System.out.print(t.data+" ");
           inorder(t.right);
      }
      static int count(node t,int a,int b){
          if(t==null)
           return 0;
           if(t.data>=a&&t.data<=b)
             return 1+count(t.left,a,b)+count(t.right,a,b);
             else if(t.data<=a)
              return count(t.right,a,b);
            //  else if(t.data>=b)
               return count(t.left,a,b);
           // return 0;
      }
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        String s1[]=sc.nextLine().split(" ");
        int a=sc.nextInt();
        int b=sc.nextInt();
         int n=s1.length;
         node root=null;
         for(int i=0;i<n;i++)
           root=insert(root,Integer.parseInt(s1[i]));
         //inorder(root);
         int ct=count(root,a,b);
         if(ct==0)
          System.out.println("NULL");
          else
             System.out.println(ct);
    }
}
