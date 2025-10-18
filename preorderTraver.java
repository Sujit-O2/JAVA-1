import java.util.ArrayList;
import java.util.List;

public class preorderTraver {
    
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer>i=new ArrayList<>();
        preord(root,i);
        return i;
        
    }

    private void preord(Node root, List<Integer> i) {
        if(root==null){
            return;
        }
        else{
            
            for(int i1=0;i1<root.children.size();i1++){
            preord(root.children.get(i1),i);
            i.add(root.children.get(i1).val);
            }
            i.add(root.val);
        }
       }
}