package bitmanipulation;

import java.util.Scanner;

/**
 * @author Abhijeet Gulve
 * <p>
 * given a “binary string”, consisting of only 0’s and 1’s.
 * find all the strings generated from N left rotations one character at a time.
 * For example if S is "101", then the strings generated from left rotations will be “011”, ”110” and ”101”.
 * Out of the generated N strings,the number of strings having even decimal value.
 */
public class NumberOfZeros {

    public static long getNumberOfZeros(String str) {
        long n = Long.parseLong(str, 2);
        long count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return (str.length() - count);
    }

    public static long countNumberOfZeroInString(String str) {
        long count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        String length;
        for (int i = 0; i < testcases; i++) {
            length = scanner.next();
            length = scanner.nextLine();
            String str = scanner.nextLine();
            System.out.println(getNumberOfZeros(str));

        }

    }
}
