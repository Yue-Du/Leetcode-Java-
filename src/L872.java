import java.util.ArrayList;
import java.util.List;

public class L872 {

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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> tree1Val = new ArrayList<>();
            List<Integer> tree2Val = new ArrayList<>();
            getLeafVal(root1,tree1Val);
            getLeafVal(root2,tree2Val);
            if (tree1Val.equals(tree2Val)){
                return true;
            }else{
                return false;
            }
        }
        public void getLeafVal(TreeNode node, List<Integer> leafVal){
            if(node == null)return;
            if(node.left == null && node.right == null){
                leafVal.add(node.val);
                return;
            }
            getLeafVal(node.left, leafVal);
            getLeafVal(node.right, leafVal);
        }
    }
}
