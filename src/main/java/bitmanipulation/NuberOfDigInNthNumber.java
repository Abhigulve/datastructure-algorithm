package bitmanipulation;

import java.util.Scanner;

/**
 * our number system having only 3 digits 1 2 3.
 * <p>
 * for single digit we are getting 3 numbers i.e 1 2 3
 * for 2 digit we are getting 9 numbers 11 12 13 21  22 23 31 32 33
 * similarly for 3 digit 3^3  = 27
 * <p>
 * Let's say we have to calculate 40th digit having how any numbers
 * so we start subtracting 3^1 then 3^2 until we find that nth number is less than Nth power
 * that's it we just hove to return Nth power
 * ex.
 *    40-3^1 =37
 *    37-3^2 =28
 *    28-3^3=1
 * <p>
 * at this time it's became smaller than the next 3 to power so the digit is of 3
 */
public class NuberOfDigInNthNumber {
    static long find(long n) {
        long sys = 3, i = 1;
        double d = Math.pow(sys, i);
        while (n > d) {
            n = (long) (n - d);
            i++;
            d = Math.pow(sys, i);
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long testcases = scanner.nextInt();
        String length;
        for (long i = 0; i < testcases; i++) {
            long str = scanner.nextLong();
            System.out.println(find(str));
        }
    }
}
