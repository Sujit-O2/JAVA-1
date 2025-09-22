import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class longestpali {

    
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
    public int[] findMode(TreeNode root) {
        if (root==null) return new int[0];
        HashMap<Integer,Integer> hh=new HashMap<>();
       checking(root,hh);
       int maxfre=0;
       for(int val :hh.values()){
        maxfre=Math.max(val,maxfre);

       }
     List<Integer> result = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : hh.entrySet()) {
            if (entry.getValue() == maxfre) {
                result.add(entry.getKey());
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
        
    }
    void checking(TreeNode root,HashMap<Integer,Integer>hh){
        if (root==null)return ;
        hh.put(root.val,hh.getOrDefault(root.val,0)+1);
        checking(root.left,hh);
        checking(root.right,hh);

    }
}