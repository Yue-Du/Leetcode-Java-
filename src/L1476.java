public class L1476 {
    private int[][] res;

    public L1476(int[][] rectangle) {
        this.res = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        if (res != null) {
            for (int r = row1; r <= row2; r++) {
                for (int c = col1; c <= col2; c++) {
                    this.res[r][c] = newValue;
                }
            }
        }
    }

    public int getValue(int row, int col) {
        if (res != null) {
            return this.res[row][col];
        }
        return -1;
    }
}
