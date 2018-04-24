
import java.util.Stack;

/**
 * @author Abhijeet Gulve
 */
public class JPAndEscapePlan {


    /**
     * 4 4
     * 1  |  2  |  3  | 4
     * 5  |  6  |  7  | 8
     * 9  |  10 | 11 | 12
     * 13 |  14 | 15 | 16
     * <p>
     * 3 3 5
     */

    int[][] visited = new int[4][4];
    Stack<Pair> path = new Stack<>();

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        calculateJpExcepePath(mat, 2, 2);
    }


    public static boolean calculateJpExcepePath(int[][] mat, int row, int col) {

        if (row == 1 || col == 1 || row == mat.length || col == mat[0].length) {
            return true;
        }

        /*if(row){

        }*/

        return true;
    }

    private static boolean isValidjp(Pair pair, Pair temp, int[][] graph, int n, int m, boolean[][] visited, int j) {
        if (temp.x < 0 || temp.x >= n) return false;
        if (temp.y < 0 || temp.y >= m) return false;
        if (visited[temp.x][temp.y]) return false;
        if (graph[temp.x][temp.y] > graph[pair.x][pair.y]) return false;
        return graph[temp.x][temp.y] >= graph[pair.x][pair.y] - j || graph[temp.x][temp.y] == graph[pair.x][pair.y];
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
