public class L1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - i;
            int left_even = (left + 1) / 2;
            int left_odd = left / 2;
            int right_even = (right + 1) / 2;
            int right_odd = right / 2;
            res += arr[i] * (left_even * right_even + right_odd * left_odd);
        }
        return res;

    }
}
