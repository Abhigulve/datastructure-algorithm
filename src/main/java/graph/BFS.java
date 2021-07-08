package graph;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {

    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            List<Integer> integers = edges.get(queue.remove());


        }
        return null;
    }
}
