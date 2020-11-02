public class mian0503 {
    public int reverseBits(int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
        int[] dp = new int[arr.length + 1];
        dp[0] = 1;
        int zeorCount = 0;
        int lastZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                dp[i + 1] = dp[i] + 1;
            } else {
                dp[i + 1] = dp[i] - dp[lastZeroIndex] + 1;
                lastZeroIndex = i + 1;
            }
        }
        int res = dp[0];
        for (int j = 1; j < dp.length; j++) {
            if (dp[j] > res) {
                res = Math.min(dp[j], 32);
            }
        }
        return res;
    }
}
