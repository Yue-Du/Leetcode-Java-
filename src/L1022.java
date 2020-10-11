public class L1022 {

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
        int mod = 1000000007;
        public int sumRootToLeaf(TreeNode root) {;
            helper(root, 0);
            return res % mod;
        }
        public void helper(TreeNode node, int cur){
            if(node == null)return;
            cur = cur * 2 + node.val;
            if(node.left == null && node.right == null){
                res += cur;
            }else{
                helper(node.left, cur);
                helper(node.right, cur);
            }
        }
    }
}
