import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1305 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        List<Integer> res = new ArrayList<>();

        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            getElements(root1);
            getElements(root2);
            Collections.sort(res);
            return res;


        }

        public void getElements(TreeNode node) {
            if (node == null) return;
            res.add(node.val);
            getElements(node.left);
            getElements(node.right);
            return;
        }
    }
}
