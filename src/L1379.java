public class L1379 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    class Solution {
        TreeNode res;

        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            return helper(cloned, target);
        }

        public TreeNode helper(TreeNode node, TreeNode target) {
            if (node == null) return null;
            if (node.val == target.val) {
                res = node;
            }
            helper(node.left, target);
            helper(node.right, target);
            return res;
        }
    }
}
