import java.util.HashMap;
import java.util.Map;

public class L993 {

     public class TreeNode {
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
        Map<Integer, Integer> depth;
        Map<Integer, TreeNode>parents;
        public boolean isCousins(TreeNode root, int x, int y) {
            depth = new HashMap();
            parents = new HashMap();
            helper(root, null);
            if(depth.get(x) == depth.get(y) && parents.get(x) != parents.get(y)){
                return true;
            }else{
                return false;
            }
        }
        public void helper(TreeNode node, TreeNode parent){
            if(node == null)return;
            parents.put(node.val, parent);
            if(parent == null){
                depth.put(node.val, 0);
            }else{
                depth.put(node.val, 1 + depth.get(parent.val));
            }
            helper(node.left,node);
            helper(node.right, node);
        }
    }
}
