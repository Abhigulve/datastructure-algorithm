package bitmanipulation;

import java.util.Scanner;

/**
 * @author Abhijeet Gulve
 * OK, just find the find the smallest number greater than n with exactly 1 bit different from n in binary form
 * <p>
 * i/p  o/p
 * 4    05
 * 10   11
 * 14   15
 */
public class NextNumberWith1BitExtra {

    public static long GetTextExtraBitNumber(long number) {
        long temp = number;
        int orNumber = 1;
        while (temp > 0) {
            if ((temp & 1) == 0) {
                return number | orNumber;
            }
            orNumber = orNumber << 1;
            temp = temp >> 1;
        }
        if (temp == 0) {
            return orNumber | number;
        }
        return 0;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for (int i = 0; i < testcases; i++) {
            System.out.println(GetTextExtraBitNumber(scanner.nextLong()));
        }
        //111 -> 1111
    }
}
