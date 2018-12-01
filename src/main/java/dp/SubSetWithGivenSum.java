package dp;

/**
 * @author Abhijeet Gulve
 */
public class SubSetWithGivenSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6};
        System.out.println(getGivenSumSubSet(array, 6, 3));
    }

    private static int getGivenSumSubSet(int[] array, int sum, int i) {
        if (i < 0) {
            return 0;
        }
        if (sum == 0) {
            return 1;
        } else if (sum < array[i]) {
            return getGivenSumSubSet(array, sum, i - 1);
        } else {
            return getGivenSumSubSet(array, sum - array[i], i - 1) + getGivenSumSubSet(array, sum, i - 1);
        }
    }

}
