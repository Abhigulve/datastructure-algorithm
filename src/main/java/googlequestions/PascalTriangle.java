package googlequestions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));

    }

    public static ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            if (i == 1) {
                ArrayList<Integer> objects = new ArrayList<>();
                objects.add(1);
                res.add(objects);
            }

        }
        return null;
    }

    List<Integer> getBionomialCoefficient(int n, int k) {

        for (int i = 0; i <= k; i++) {

        }
        return null;
    }


}
