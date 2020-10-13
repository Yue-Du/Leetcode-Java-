public class L897 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        TreeNode res = new TreeNode(0);
        TreeNode cur = res;
        public TreeNode increasingBST(TreeNode root) {
            helper(root);
            return res.right;
        }
        public void helper(TreeNode node){
            if(node == null)return;
            helper(node.left);
            node.left = null;
            cur.right = node;
            cur = node;
            helper(node.right);
        }
    }
}
