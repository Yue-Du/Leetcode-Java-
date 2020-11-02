public class L1217 {
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int oddSum = 0;
            int evenSum = 0;
            for (int i = 0; i < position.length; i++) {
                if (position[i] % 2 == 0) {
                    evenSum += 1;
                } else {
                    oddSum += 1;
                }
            }
            if (oddSum <= evenSum) {
                return oddSum;
            } else {
                return evenSum;
            }

        }
    }
}
