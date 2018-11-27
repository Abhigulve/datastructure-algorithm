package graph;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class AdjucencyListGraph {
    List<Integer> adjList[];
    int v;


    AdjucencyListGraph(int v) {
        this.v = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }


    static void addEdge(AdjucencyListGraph adjucencyListGraph, int scr, int dest) {
        adjucencyListGraph.adjList[scr].add(dest);
        adjucencyListGraph.adjList[dest].add(scr);
    }

    static void printGraph(AdjucencyListGraph graph) {
        for (int v = 0; v < graph.v; v++) {
            System.out.println("Adjacency list of vertex " + v);
            System.out.print("head");
            for (Integer pCrawl : graph.adjList[v]) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        // create the graph given in above figure
        int V = 5;
        AdjucencyListGraph graph = new AdjucencyListGraph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        // print the adjacency list representation of
        // the above graph
        printGraph(graph);
    }
}
