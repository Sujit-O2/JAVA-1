public class MinimumDepthofBinaryTree {
    
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
    public int minDepth(TreeNode root) {
        int count=0;
        if(root==null) return 0;
       count= mind(root,count);
       return count;

        
    }

    private int mind(TreeNode root, int count) {
       if(root==null){
            return Integer.MAX_VALUE;

        }
        if(root.left==null&&root.right==null){
            return 1;

        }
        int a=mind(root.left,++count);
        int b=mind(root.right,++count);
        return 1+ Math.min(a,b);
    }
}