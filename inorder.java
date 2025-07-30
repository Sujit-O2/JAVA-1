import java.util.ArrayList;
import java.util.List;

public class inorder {
    
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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        nodeing(root);
        return ll;
    }
    public void nodeing(TreeNode nod){
        if(nod==null) return;
        nodeing(nod.left);
        ll.add(nod.val);
        nodeing(nod.right);
        

    }
}