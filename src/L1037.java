public class L1037 {
    public boolean isBoomerang(int[][] points) {
        int[] a = points[0];
        int[] b = points[1];
        int[] c = points[2];
        if (isSamePoint(a, b) || isSamePoint(a, c) || isSamePoint(b, c)) {
            return false;
        }
        return !inSameLine(a, b, c);
    }

    public boolean isSamePoint(int[] x, int[] y) {
        return (x[0] == y[0]) && (x[1] == y[1]);
    }

    public boolean inSameLine(int[] x, int[] y, int[] z) {
        return ((y[1] - x[1]) * (y[0] - z[0]) == (y[0] - x[0]) * (y[1] - z[1])) && ((y[1] - x[1]) * (z[0] - x[0]) == (z[1] - x[1]) * (y[0] - x[0]));
    }

}
