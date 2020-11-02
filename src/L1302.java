public class L1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        int maxDepth = 0;
        int res = 0;

        public int deepestLeavesSum(TreeNode root) {
            hepler(root, 0);
            return res;
        }

        public void hepler(TreeNode node, int depth) {
            if (node == null) return;
            if (node.left == null && node.right == null && depth > maxDepth) {
                maxDepth = depth;
                res = node.val;
            } else if (node.left == null && node.right == null && depth == maxDepth) {
                res += node.val;
            }
            hepler(node.left, depth + 1);
            hepler(node.right, depth + 1);
            return;
        }
    }
}
