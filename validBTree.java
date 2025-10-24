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

    public boolean isValidBST(TreeNode root) {
    return slove(root ,Long.MAX_VALUE,Long.MIN_VALUE);

    }

    private boolean slove(TreeNode root, long maxValue, long minValue) {
       if(root==null){
        return true;

       }
       if(root.val<=minValue||root.val>=maxValue)return false;
       return slove(root.left,root.val,minValue)&&slove(root.right,maxValue,root.val);
    
    }
        
    }
