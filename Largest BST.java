
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static public  int maxsize=-1;
    static int largestBst(Node root)
    {
         maxsize=-1;
        inorder(root);
        return maxsize;
        
    }
    public static void  inorder(Node root){
        if(root==null)
         return ;
         inorder(root.left);
          if(isbst(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
           {
               maxsize=Math.max(maxsize,size(root));
               //System.out.println(size(root));
           }
           inorder(root.right);
           //return maxsize;
         
    }
    public static int size(Node root){
        if(root==null)
         return 0;
         return size(root.left)+size(root.right)+1;
    }
    public static boolean isbst(Node root,int min,int max)
      {
          if(root==null)
           return true;
           if(min>=root.data||max<=root.data)
               return false;
               return isbst(root.left,min,root.data)
                       &&isbst(root.right,root.data,max);
      }
    
}
