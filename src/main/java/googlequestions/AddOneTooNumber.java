package googlequestions;

/**
 * @author Abhijeet Gulve
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a non-negative number represented as an array of digits,
 * <p>
 * add 1 to the number ( increment the number represented by the digits ).
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class AddOneTooNumber {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(3);
        a.add(7);

        System.out.println(plusOne(a));

        //Expected Result 124

    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        if (a.size() == 0 || a == null) {
            return res;
        }
        int j = 0;
        while (a.get(j) == 0) {
            if (a.size() == (j + 1)) {
                break;
            }
            j++;
        }

        int carry = 0;
        res.add(((a.get(a.size() - 1) + 1) % 10) + carry);
        carry = (a.get(a.size() - 1) + 1) / 10;
        for (int i = a.size() - 2; i >= j; i--) {

            res.add((a.get(i) + carry) % 10);
            carry = (a.get(i) + carry) / 10;
        }
        if (carry > 0) {
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }
}
