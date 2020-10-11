import java.util.ArrayList;
import java.util.List;

public class L429 {
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
    }


    class Solution {

        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>>res = new ArrayList<>();
            if(root == null)return res;
            List<Node>parents = new ArrayList<>();
            parents.add(root);

            while(!parents.isEmpty()){
                List<Node>childs = new ArrayList<>();
                List<Integer>parents_val = new ArrayList<>();
                for(Node node : parents){
                    parents_val.add(node.val);
                    childs.addAll(node.children);
                }
                res.add(parents_val);
                parents = childs;
            }
            return res;
        }
    }

}




