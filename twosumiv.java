import java.util.ArrayList;
import java.util.List;

public class twosumiv {
    
}
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
// class Solution {
//     Set<Integer> set = new HashSet<Integer>();

//     public boolean findTarget(TreeNode root, int k) {
//         if(root == null){
//             return false;
//         }

//         if(set.contains(k - root.val)){
//             return true;
//         }
//                 set.add(root.val);
//         return findTarget(root.left,k) || findTarget(root.right,k);
//     }
// }
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> aa=new ArrayList<>();
        sending(aa,root);
        for(int a=0;a<aa.size();a++){
            for(int i=a+1;i<aa.size();i++){
                if(aa.get(a)+aa.get(i)==k){
                    return true;
                }
            }
        }


        return false;
        
    }

    private void sending(List<Integer> aa, TreeNode root) {
        if(root==null){
            return;
        }
        aa.add(root.val);
        sending(aa, root.left);
        sending(aa, root.right);
       }
}