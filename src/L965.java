public class L965 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        boolean sign = true;
        int val;
        public boolean isUnivalTree(TreeNode root) {
            if(root == null)return sign;
            val = root.val;
            isSameValue(root);
            return sign;
        }
        public void isSameValue(TreeNode node){
            if(node == null)return;
            if(node.val != val){
                sign = false;
            }
            isSameValue(node.left);
            isSameValue(node.right);

        }
    }
}
