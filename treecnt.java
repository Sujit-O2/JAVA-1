public class treecnt {
    
}

   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 
class Solution {
    public int getMinimumDifference(TreeNode root) {
        int sum=0;
         if(root==null)return sum;
         if(root.left!=null)sum++;
         if(root.right!=null)sum++;
        
        return calling(root,sum);
        
        
    }

    private int calling(TreeNode root, int sum) {
        if(root==null)return sum;

           
        
           
        return sum;

       }
}