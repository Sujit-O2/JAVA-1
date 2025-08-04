public class SujitMirror {
    
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
    boolean flag=true;
    public boolean isSymmetric(TreeNode root) {
        TreeNode tt=root.left;
        TreeNode t1=root.right;
        checkk(tt,t1);


        return flag;
    }
    public void checkk(TreeNode tt,TreeNode t1){
       if (tt == null && t1 == null) return;

        if (tt == null || t1 == null || tt.val != t1.val) {
            flag = false;
            return;
        }
        checkk(tt.left,t1.right);
        checkk(tt.right,t1.left);
    }
    
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
       int lD= maxDepth(root.left);
       int rD= maxDepth(root.right);
        return Math.max(lD,rD)+1;
        
    }
      public TreeNode sortedArrayToBST(int[] nums) {
        return Checker(nums,0,nums.length-1);
        
    }
      private TreeNode Checker(int[] nums, int left, int right) {
        if(left>right)return null;
        int mid=left+(right-left)/2;
        TreeNode tt=new TreeNode(nums[mid]);
        tt.left=Checker(nums,left,mid-1);
        tt.right=Checker(nums,mid+1,right);
        return tt;
        


    
    }
    
}