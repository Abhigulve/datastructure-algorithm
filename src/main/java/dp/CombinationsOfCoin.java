package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class CombinationsOfCoin {

    public static void main(String[] args) {
        List<String> allCombinations = new ArrayList<>();
        getAllCombinations(3, allCombinations, "");
        System.out.println(allCombinations);
    }

    private static void getAllCombinations(int level, List<String> allCombinations, String str) {
        if (level == 0) {
            allCombinations.add(str);
            return;
        }
        getAllCombinations(level - 1, allCombinations, str + "H");
        getAllCombinations(level - 1, allCombinations, str + "T");
    }
}
