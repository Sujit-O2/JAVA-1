import java.util.ArrayList;
import java.util.List;

public class BynarryaPrePost {
    
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
    List<Integer> ll=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        sujit(root);
        return ll;

        
    }
    public void sujit(TreeNode root) {
        if(root==null) return;
        
        sujit(root.left);
        sujit(root.right);
        ll.add(root.val);


        }
}