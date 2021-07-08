package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddOne2Array {
    public static void main(String[] args) {
        List<Integer> integers = plusOne(Arrays.asList(9,9,9,9));
        System.out.println(integers);
    }

    //9 9 9 +1   0001
    //
    //1,2,3
    //9 10
    public static List<Integer> plusOne(List<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 1;
        for (int i = a.size() - 1; i >= 0; i--) {
            int sum = a.get(i) + carry;
            res.add(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0)
            res.add(carry);
        Collections.reverse(res);
        return res;
    }

}
