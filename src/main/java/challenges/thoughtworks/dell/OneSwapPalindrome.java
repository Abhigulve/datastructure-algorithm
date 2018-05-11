package challenges.thoughtworks.dell;

import java.util.Arrays;
import java.util.Scanner;

class OneSwapPalindrome {

    static int NO_OF_CHARS = 256;
    /* function to check whether characters
     of a string can form a palindrome */
    static boolean canFormPalindrome(String str) {

        // Create a count array and initialize all
        // values as 0
        int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < str.length(); i++)
            count[(int)(str.charAt(i))]++;

        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++)
        {
            if ((count[i] & 1) == 1)
                odd++;

            if (odd > 1)
                return false;
        }

        // Return true if odd count is 0 or 1,
        return true;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < i1; i++) {
            String s = scanner.nextLine();
            if (canFormPalindrome(s))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}