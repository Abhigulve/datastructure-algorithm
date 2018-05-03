package permutation.deshaw;

import java.util.Scanner;

/**
 * @author Abhijeet Gulve
 */
public class AndSum {
    private static void findSubsets(long array[]) {
        long numOfSubsets = 1 << array.length;
        long a = 0;
        for (long i = 0; i < numOfSubsets; i++) {
            int pos = array.length - 1;
            long bitmask = i;
            long temp = 0;
            long count = 0;
            while (bitmask > 0) {
                if ((bitmask & 1) == 1) {
                    if (count == 0) {
                        temp = array[pos];
                    } else
                        temp = array[pos] & temp;
                    count++;
                }
                //this will shift this number to left so one bit will be remove
                bitmask >>= 1;
                pos--;
            }
            count = 0;
            a += temp;
            temp = 0;
        }
        System.out.println(a);
    }
    static final int M=1000000007;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for (int i = 0; i < testcases; i++) {
            int arrlength = scanner.nextInt();
            long[] array = new long[arrlength];
            scanner.nextLine();
            String[] str = scanner.nextLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                array[j] = Integer.parseInt(str[j]);
            }
            findSubsets(array);
        }
    }
}
