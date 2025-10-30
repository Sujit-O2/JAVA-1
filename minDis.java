public class minDis {
    
}

class Solution {
    Integer prev = null;
    int mindis = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        findMin(root);
        return mindis;
    }

    private void findMin(TreeNode root) {
        if(root==null) return;
      findMin(root.left);
      if(prev!=null){
        mindis=Math.min(mindis,root.val-prev);
      }
      prev=root.val;
      findMin(root.right);
    }
}

