public class countTreeNode {
    
}
class Solution {
    int a=0;
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        else{
            a++;
        }
        countNodes(root.left);
        countNodes(root.right);
        return a;
        
    }
    
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
