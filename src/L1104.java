import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1104 {
    public List<Integer> pathInZigZagTree(int label) {
        ArrayList<Integer> res = new ArrayList<>();
        int depth = (int) (Math.log(label) / (Math.log(2)));
        while (label > 1) {
            res.add(label);
            label = (int) (3 * Math.pow(2, depth - 1) - 1 - label / 2);
            depth -= 1;
        }
        res.add(1);
        Collections.reverse(res);
        return res;
    }
}
