//import for Scanner and other utility classes

import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Binary {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();                 // Reading input from STDIN

        int arraysize = Integer.parseInt(input.split(" ")[0]);
        int query = Integer.parseInt(input.split(" ")[1]);
        int numbers[] = new int[arraysize];

        String[] split = s.nextLine().split(" ");
        for (int l = 0; l < split.length; l++) {
            numbers[l] = Integer.parseInt(split[l]);
        }
        for (int k = 0; k < query; k++) {
            System.out.println(getSubarray(numbers, s.nextInt()));
        }

    }

    public static int getSubarray(int[] array, int k) {
        int tillK = 0;
        if (k == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            tillK += getnumOne(Integer.toBinaryString(array[i]));
            if (tillK >= k) {
                return (i + 1);
            }
        }
        return -1;
    }

    public static int getnumOne(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
