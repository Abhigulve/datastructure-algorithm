package bitmanipulation;

import java.util.Arrays;
import java.util.List;

public class UniqueNumberFromArray {
    public static int singleNumber(final List<Integer> a) {
        int num = a.get(0);

        for (int i = 1; i < a.size(); i++) {

            num = num ^ a.get(i);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(Arrays.asList( 1, 3, 3, 6, 6, 8, 8, 2)));
    }
}
