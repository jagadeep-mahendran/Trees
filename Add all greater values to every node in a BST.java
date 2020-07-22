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
    static int last=0;
    // modify the BST and return its root
    public void inorderreverse(Node root)
     {  
          if(root==null)
           return ;
         inorderreverse(root.right);
          root.data=root.data+last;
         last=root.data;
        
         inorderreverse(root.left);
     }
    public Node modify(Node root)
    {
        //Write your code here
        last=0;
        inorderreverse(root);
        return root;
        
        
    }
    
}
