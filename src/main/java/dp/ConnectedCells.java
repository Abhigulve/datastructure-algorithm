package dp;

/**
 * @author Abhijeet Gulve
 */
public class ConnectedCells {

    public static int getMaxSizeMat(int[][] matrix, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return 0;
        }
        if (matrix[row][col] == 0) {
            return 0;
        }
        int maxSize =1;
        matrix[row][col] = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (c != col || r != row) {
                    maxSize += getMaxSizeMat(matrix, r, c);
                }
            }
        }
        return maxSize;
    }

    static int connectedCell(int[][] matrix) {
        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    int maxSizeMat = getMaxSizeMat(matrix, row, col);
                    max = Math.max(max, maxSizeMat);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] mat = new int[4][];
        mat[0] = new int[]{1, 1, 0, 0};
        mat[1] = new int[]{0, 1, 1, 0};
        mat[2] = new int[]{0, 0, 1, 0};
        mat[3] = new int[]{1, 0, 0, 0};

        System.out.println(connectedCell(mat));

    }

}
