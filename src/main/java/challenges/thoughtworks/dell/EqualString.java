package challenges.thoughtworks.dell;

import java.util.Scanner;

public class EqualString {

    public static long printNumber(long arr[]) {

        long[] A = arr;

        long totalSum = 0;
        long rightSum = 0;
        long leftSum = 0;
        long minNum = Long.MAX_VALUE;

        //total sum
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                minNum = 0;
                break;
            } else if (leftSum < rightSum) {
                long temp = rightSum - leftSum;
                if (temp < minNum) {
                    minNum = temp;
                }
            }
        }
        if (minNum == Long.MAX_VALUE) {
            minNum = -1;
        }
        return minNum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long testcases = scanner.nextInt();
        for (long i = 0; i < testcases; i++) {
            int len = scanner.nextInt();
            scanner.nextLine();

            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            long[] array = new long[len];
            for (int j = 0; j < len; j++) {
                array[j] = Long.parseLong(s1[j]);
            }
            System.out.println(printNumber(array));
        }
    }
}