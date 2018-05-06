package challenges.thoughtworks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[1]);
        int len = Integer.parseInt(arr[0]);
        char[] strA = scanner.nextLine().toCharArray();
        char[] strB = scanner.nextLine().toCharArray();
        int small = 0;
        Set<Integer> unset = new HashSet<>(len);

        for (int k = 0; k < len; k++) {
            if (strA[k] == '1' && strB[k] == '0') {
                unset.add(k + 1);
            }
            if (strA[k] == '0') {
                small = k;
                break;
            }
        }
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int integer = scanner.nextInt();
            if (unset.contains(integer)) {
                if (integer == small) {
                    flag = true;
                }
                count++;
            }

            if (unset.size() == count || flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

  /*  private static int compaireTo(String a1, String b1) {
        int i = 0;
        while (i < a1.length())
            if (Long.parseLong(a1.substring(i, Math.min(a1.length(), 63)), 2) <= Long.parseLong(b1.substring(i, Math.min(b1.length(), 63)), 2)) {
                i += 64;
            } else return -1;
        return 0;
    }*/
}