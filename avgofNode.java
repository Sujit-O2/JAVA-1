import java.util.ArrayList;
import java.util.List;

public class avgofNode {
    
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
    
    public List<Double> averageOfLevels(TreeNode root) {
        List <Double> dd=new ArrayList<>();
        if(root!=null){
            dd.add((double) root.val);
        }
        sending(dd,root);
        return dd;

        
    }

    private void sending(List<Double> dd, TreeNode root) {
        if(root ==null){
            return;
        }
        
        if(root.left!=null&&root.right!=null){
            
            dd.add((double)(root.left.val+root.right.val)/2);
        }
        else if(root.left!=null||root.right!=null){
            double sum=((root.left==null)?0:root.left.val)+((root.right==null)?0:root.right.val);
            dd.add(sum);
        }
        else {
            return;
        }
        sending(dd, root.left);
        sending(dd, root.right);

        

        }
}