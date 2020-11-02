public class L1448 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int res = 0;

        public int goodNodes(TreeNode root) {
            int maxVal;
            if (root != null) {
                maxVal = root.val;
            } else return res;
            helper(root, maxVal);
            return res;
        }

        public void helper(TreeNode node, int maxVal) {
            if (node == null) return;
            if (node.val >= maxVal) {
                res += 1;
                maxVal = node.val;
            }
            helper(node.left, maxVal);
            helper(node.right, maxVal);
        }
    }
}
