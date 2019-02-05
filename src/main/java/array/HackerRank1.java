package array;

import java.util.*;

/**
 * @author Abhijeet Gulve
 */
public class HackerRank1 {

    public static void main(String[] args) {
        int[] array = {-3, 2, 4, -1, -2, -5};
        System.out.println(getConsecutiveMaxSum(array));
    }

    static int getConsecutiveMaxSum(int[] array) {
        int currentMax = 0;
        int max =0;
        if (array.length == 1) {
            return array[0];
        }

        if (array.length == 0) {
            return 0;
        }
        int count = 0, conse = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentMax + array[i] > currentMax) {
                currentMax = currentMax + array[i];
                conse++;
                if(conse>1) {
                    count=0;
                }
            } else if (count == 1) {
                currentMax = currentMax + Math.max(array[i], array[i - 1]);
                count = 0;
            }  else {
                count = 1;
            }
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }

    public static boolean isBalace(String value) {
        Stack<Character> stack = new Stack<>();
        char upperElement = 0;
        for (int i = 0; i < value.length(); i++) {
            if (!stack.isEmpty()) {
                upperElement = stack.peek();
            }
            stack.push(value.charAt(i));
            if (!stack.isEmpty() && stack.size() > 1) {
                if ((upperElement == '[' && stack.peek() == ']') ||
                        (upperElement == '{' && stack.peek() == '}') ||
                        (upperElement == '(' && stack.peek() == ')')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }

    public String test(String s) {
        String[] words = {};
        if (s.contains(" ")) {
            words = s.split(" ");
        } else if (s.contains("   ")) {
            words = s.split("   ");
        } else if (s.contains(",")) {
            words = s.split(",");
        } else if (s.contains(":")) {
            words = s.split(":");
        } else if (s.contains("-")) {
            words = s.split("-");
        } else if (s.contains(".")) {
            words = s.split(".");
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                return words[i];
            } else {
                map.put(words[i], 0);
            }

        }
        return "";
    }
}
