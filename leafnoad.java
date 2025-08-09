public class leafnoad {
    
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
    boolean flag=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null ){
            return flag;
        }
        
        targetSum-=root.val;
        if(targetSum==0){
            flag=true;
            return true;
        }
        hasPathSum(root.left,targetSum);
        hasPathSum(root.right,targetSum);

        return flag;
        
    }
}