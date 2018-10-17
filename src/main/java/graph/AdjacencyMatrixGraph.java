package graph;

import java.util.Scanner;

/**
 * @author Abhijeet Gulve
 */
public class AdjacencyMatrixGraph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Adjacency Matrix size=");
        int size = scanner.nextInt();

        boolean adMat[][] = new boolean[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.println("is " + i + "->" + j + "is connection \nif Yes enter true else false");
                adMat[i - 1][j - 1] = scanner.nextBoolean();
            }

        }
        char exit = 0;
        for (int i = 0; i < size; ++i) {
            System.out.println("Adjacency list of node " + i + ": ");
            for (int j = 0; j < adMat[i].length; ++j) {
                if (j == adMat[i].length - 1)
                    System.out.println(adMat[i][j]);
                else
                    System.out.println(adMat[i][j] + " --> ");
            }
        }

    }
}
