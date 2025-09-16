public class sumOfLeftLeaves {
    
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        sum=addingLeaves(root,sum,-1);
        return sum;
        
    }
    int addingLeaves(TreeNode root,int sum,int flag){
        if(root==null)
        return sum;
        if(root.left==null&&root.right==null){
            if(flag==0)
            sum=sum+root.val;
        }
        int a=addingLeaves(root.left,sum,0);
        sum=0;
        int b=addingLeaves(root.right,sum,1);
        return a+b;
    }
}