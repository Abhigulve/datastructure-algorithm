/**
 * @author Abhijeet Gulve
 */
public class BestPath {

    /**
     * | 1 3 4 5 |
     * | 7 8 2 9 |
     * | 1 3 2 1 |
     * | 1 6 2 1 |
     * | 5 1 3 7 |
     */

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 3, 4, 5},
                        {7, 8, 2, 9},
                        {1, 3, 7, 1},
                        {1, 6, 9, 1},
                        {5, 1, 3, 7}

                };
        System.out.println(bestPath(mat, 0, 0));
    }

    public static int bestPath(int[][] mat, int row, int col) {
        if (row == mat.length - 1 && col == mat[0].length - 1) {
            return mat[row][col];
        }
        if (row < mat.length - 1 && col < mat[0].length - 1) {
            int min1 = mat[row][col] + bestPath(mat, row, col + 1);
            int min2 = mat[row][col] + bestPath(mat, row + 1, col);
            return Math.min(min1, min2);
        } else if (row == mat.length - 1 && col < mat[0].length - 1) {
            return mat[row][col] + bestPath(mat, row, col + 1);
        } else //if (row < mat.length - 1 && col == mat[0].length - 1)
            return mat[row][col] + bestPath(mat, row + 1, col);
        //return 0;
    }
}
