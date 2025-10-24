class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        return slove(root, root.val);
    }

    private int slove(TreeNode root, int minVal) {
        if (root == null) return -1;

        if (root.val > minVal) return root.val;

        int left = slove(root.left, minVal);
        int right = slove(root.right, minVal);

        if (left == -1) return right;
        if (right == -1) return left;
        return Math.min(left, right);
    }
}
