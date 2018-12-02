import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestClass {

    static List<Integer> integers = new ArrayList<Integer>();

    static int maxIndex = 0;
    static int size = 0;
    static int ter = 0;

    public static void test(int ele, List<Integer> sublistBeforeMax, List<Integer> sublistafterMax, int terminate) {
        ter++;
        maxIndex = maxIndex();
        if (size == 0)
            size = integers.size();
        if (ele >= integers.get(maxIndex)) {
            System.out.println(size);
            return;
        }
        if (sublistBeforeMax == null) {
            sublistBeforeMax = integers.subList(0, maxIndex);
            sublistafterMax = integers.subList(maxIndex, integers.size());
        }
        if (ele == integers.get(maxIndex)) {
            return;
        } else {
            if (!sublistBeforeMax.contains(ele)) {
                size++;
                System.out.println(size);
                sublistBeforeMax.add(ele);
                return;

            } else if (!sublistafterMax.contains(ele)) {
                size++;
                System.out.println(size);
                sublistafterMax.add(ele);
                return;
            } else {
                System.out.println(size);
            }
        }

        if (terminate == ter) {
            sublistBeforeMax.forEach(el -> System.out.print(el + " "));
            sublistafterMax.forEach(el -> System.out.print(el + " "));
        }

    }

    private static int maxIndex() {
        int limit = integers.size();
        int max = Integer.MIN_VALUE;
        int maxPos = -1;
        for (int i = 0; i < limit; i++) {
            int value = integers.get(i);
            if (value > max) {
                max = value;
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static void main(String args[]) throws Exception {
//
//        //Scanner
//        Scanner s = new Scanner(System.in);
//        String size = s.nextLine();
//
//
//
//        String list = s.nextLine();
//        List<Integer> sublistBeforeMax = null;
//        List<Integer> sublistafterMax = null;
//        List<String> oplist = Arrays.asList(list.split(" "));
//        oplist.forEach(s1 -> integers.add(Integer.parseInt(s1)));
//        int op = s.nextInt();
//        for (int i = 0; i < op; i++) {
//            int val = s.nextInt();
//            test(val, sublistBeforeMax, sublistafterMax, op);
//        }
        Scanner s = new Scanner(System.in);
        String firstLine = s.nextLine();
        String[] s1 = firstLine.split(" ");
        int lenth = Integer.parseInt(s1[0]);
        String secondLine = s.nextLine();
        String[] s2 = secondLine.split(" ");
        int[] array = new int[lenth];
        for (int i = 0; i < lenth; i++) {
            array[i] = Integer.parseInt(s2[i]);
        }

//        int[] ints = {2, 8, 1, 14};
        System.out.println(test(array, Integer.parseInt(s1[1])));


    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int nextPrime(int n) {
        BigInteger b = new BigInteger(String.valueOf(n));
        return Integer.parseInt(b.nextProbablePrime().toString());
    }

    public static int test(int[] array, int k) {
        int eff = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isPrime(array[i])) {
                eff += (nextPrime(array[i]) - array[i]);
                count++;
                if (count == k) {
                    return eff;
                }
            } else {
                count++;
            }
        }
        return eff;
    }


}
