//imports for BufferedReader

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class TestClass1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        int X = scanner.nextInt() - 1, Y = scanner.nextInt() - 1, J = scanner.nextInt();
        jPDfs(graph, X, Y, J, n, m);
    }

    private static void jPDfs(int[][] graph, int x, int y, int j, int n, int m) {
        int[] dirX = {0, 1, 0, -1};
        int[] dirY = {1, 0, -1, 0};
        Stack<Pair> stack = new Stack<>();
        boolean[][] visited = new boolean[n][m];
        boolean result;
        ArrayList<Pair> path = new ArrayList<>();
        Pair start = new Pair(x, y);
        path.add(start);
        visited[x][y] = true;
        result = dfsUtil(start, visited, n, m, graph, j, path, dirX, dirY);
        System.out.println(result ? "YES" : "NO");
        if (result) {
            System.out.println(path.size());
            for (Pair pair : path) System.out.println((pair.x + 1) + " " + (pair.y + 1));
        }
    }

    private static boolean dfsUtil(Pair pair, boolean[][] visited, int n, int m, int[][] graph, int j, ArrayList<Pair> path, int[] dirX, int[] dirY) {
        if (pair.x == 0 || pair.x == n - 1 || pair.y == 0 || pair.y == m - 1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            Pair temp = new Pair(pair.x + dirX[i], pair.y + dirY[i]);
            if (isValidjp(pair, temp, graph, n, m, visited, j)) {
                if (dfsUtil(temp, visited, n, m, graph, j, path, dirX, dirY)) {
                    path.add(1, temp);
                    return true;
                }
            }
        }
        return false;
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