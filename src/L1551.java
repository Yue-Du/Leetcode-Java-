public class L1551 {
    public int minOperations(int n) {
        int res = 0;
        if (n % 2 == 0) {
            int diff = 1;
            for (int i = 1; i <= n / 2; i++) {
                res += diff;
                diff += 2;
            }

        } else {
            int diff = 0;
            for (int i = 0; i <= n / 2; i++) {
                res += diff;
                diff += 2;
            }
        }
        return res;

    }
}
