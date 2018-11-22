package googlequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class MaxNonNegativeSubArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(5);
//        list.add(2);
//        list.add(-7);
//        list.add(1);
//        list.add(2);


//
//        list.add(0);
//        list.add(0);
//        list.add(-1);
//        list.add(0);
//        list.add(756898537);
//        list.add(-1973594324);
//        list.add(-1303455736);
//        list.add(-521595368);
//        list.add(1973594324);
        list = Arrays.asList(24115, -75629, -46517, 30105, 19451, -82188, 99505, 6752, -36716, 54438, -51501, 83871, 11137, -53177, 22294, -21609, -59745, 53635, -98142, 27968, -260, 41594, 16395, 19113, 71006, -97942, 42082, -30767, 85695, -73671);
        System.out.println(maxset(list));
    }

    //A : [ 24115, -75629, -46517, 30105, 19451, -82188, 99505, 6752, -36716, 54438, -51501, 83871, 11137, -53177, 22294, -21609, -59745, 53635, -98142, 27968, -260, 41594, 16395, 19113, 71006, -97942, 42082, -30767, 85695, -73671 ]
    public static ArrayList<Integer> maxset(List<Integer> a) {
        long currntSum = 0;
        long maxSum = 0;
        ArrayList<Integer> currentArray = new ArrayList<>();
        ArrayList<Integer> maxArray = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                currntSum = a.get(i) + currntSum;
                currentArray.add(a.get(i));
            }
            if (a.get(i) < 0 | (a.size() - 1 == i)) {
                if (maxSum <= currntSum) {
                    if (maxSum == currntSum) {
                        if (maxArray.size() < currentArray.size()) {
                            maxArray.clear();
                            maxArray.addAll(currentArray);
                            currentArray.clear();
                            currntSum = 0;
                            continue;
                        }
                    } else {
                        maxArray.clear();
                        maxArray.addAll(currentArray);
                        maxSum = currntSum;
                        currentArray.clear();
                        currntSum = 0;
                    }
                }
                currentArray.clear();
                currntSum = 0;
            }
        }
        return maxArray;
    }
}
