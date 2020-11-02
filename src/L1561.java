import java.util.Arrays;

public class L1561 {
    public int maxCoins(int[] piles) {
        int n = piles.length / 3;
        Arrays.sort(piles);
        int res = 0;
        int index = piles.length - 2;
        for (int i = 0; i < n; i++) {
            res += piles[index];
            index -= 2;
        }
        return res;

    }
}
