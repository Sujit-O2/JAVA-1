public class banc {
    
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
    int a=0;
    public boolean isBalanced(TreeNode root) {
        a=balence(root);
        if(a>=-1||a<=1){
            return true;
        }
        else{
            return false;
        }

        
    }
    public int balence(TreeNode root){
        if(root.left!=null){
            a++;

        }
        if(root.right!=null){
            a--;
        }
        a=balence(root.left);
        a=balence(root.right);

        return a;
    }
}