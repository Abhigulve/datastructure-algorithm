import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Abhijeet Gulve
 */
public class Subarray {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcase = Integer.parseInt(s.nextLine());
        int arraySize = Integer.parseInt(s.nextLine());
        String arra = s.nextLine();
        int numbers[] = new int[arraySize];
        String[] split = arra.split(" ");
        for (int l = 0; l < arraySize; l++) {
            numbers[l] = Integer.parseInt(split[l]);
        }
        for (int i = 0; i < testcase; i++) {

        }
        System.out.println(printSubsequences(numbers));
        System.out.println(findSum(numbers));
    }

    static int printSubsequences(int[] arr) {
        int opsize = (int) Math.pow(2, arr.length);
        int ans = 0;
        for (int counter = 1; counter < opsize; counter++) {
            int internal = 0;
            for (int j = 0; j < arr.length; j++) {
                if (BigInteger.valueOf(counter).testBit(j))
                    internal = (internal | arr[j]);
            }
            ans += internal;
        }
        return ans;
    }

    // Returns sum of XORs of all subsets
    static int xorSum(int arr[]) {
        int bits = 0;
        for (int i = 0; i < arr.length; ++i)
            bits |= arr[i];
        int ans = bits * (int) Math.pow(2, arr.length - 1);
        return ans + 10;
    }


    static int findSum(int arr[]) {
        // Sum all array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        // Result is sum * 2^(n-1)
        return sum * (1 << (arr.length - 1));
    }
}
