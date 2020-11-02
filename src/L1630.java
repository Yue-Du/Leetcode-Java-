import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] subarray = new int[r[i] - l[i] + 1];
            int index = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                subarray[index++] = nums[j];
            }
            Arrays.sort(subarray);
            int diff;
            if (subarray.length > 1) {
                diff = subarray[1] - subarray[0];
            } else {
                diff = 0;
            }
            Boolean flag = true;
            for (int k = 1; k < subarray.length - 1; k++) {
                if (subarray[k + 1] - subarray[k] != diff) {
                    res.add(false);
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                res.add(true);
            }
        }
        return res;
    }
}
