public class BintreeTile {

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
    int sum = 0;

    public int findTilt(TreeNode root) {
        helper(root);
        return sum;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        int leftSum = helper(node.left);
        int rightSum = helper(node.right);

        sum += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + node.val;
    }
}
