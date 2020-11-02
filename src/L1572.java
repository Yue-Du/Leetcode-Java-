public class L1572 {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int summ = 0;
        for (int i = 0; i < length; i++) {
            summ += mat[i][i];
            summ += mat[length - 1 - i][i];
        }
        if (length % 2 == 1) {
            summ -= mat[length / 2][length / 2];
        }
        return summ;

    }
}
