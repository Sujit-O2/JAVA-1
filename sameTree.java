public class sameTree {

    
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
    Boolean flat=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        checking(p,q);
        return flat;

        
    }
    public void checking(TreeNode p,TreeNode q){
        if(p==null&q==null){
            
            return;
        }
        if(p==null||q==null){
            flat=false;
            return;
        }
        if(p.val!=q.val){
        flat=false;
        return;
        }
        checking(p.left,q.left);
        checking(p.right,q.right);
    }
}