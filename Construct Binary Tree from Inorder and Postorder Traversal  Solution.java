/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     static int pst;
    public TreeNode util(int in[],int post[],int srt,int end,Map<Integer,Integer> mp)
    {
        if(srt>end)
             return  null;
         int cur=post[pst--];
        TreeNode node =new TreeNode(cur);
         //pst--;
             if(srt==end)
                   return node;
          int index=mp.get(cur);
        
         node.right=util(in,post,index+1,end,mp);
         node.left=util(in,post,srt,index-1,mp);
        
        
        return node;
    }
    public TreeNode buildTree(int[] in, int[] post) {
        pst=in.length-1;
          Map<Integer,Integer> mp=new HashMap<>();
         for(int i=0;i<in.length;i++)
              mp.put(in[i],i);
        
        return util(in,post,0,in.length-1,mp);
    }
}
