package hackerrank.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Abhijeet Gulve
 */
public class RoadsandLibraries {
    Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public int calCost() {
        int cost = 0;

        return cost;
    }

    public void createAdjecencyList() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        adjacencyList.put(1, list);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        adjacencyList.put(3, list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        adjacencyList.put(2, list2);
    }
}
