package array;

/**
 * @author Abhijeet Gulve
 */
public class PaintersPartition {

    public static void main(String[] args) {
        int arr[] = {10, 20, 60, 50, 30, 40};

        // Calculate size of array.
        int n = arr.length;
        int k = 3;
        System.out.println(partition(arr, n, k));
    }

    private static int partition(int[] arr, int n, int k) {

        int sum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        int finalAns = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = (arr[start] + arr[end]) / 2;
            if (getPart(arr, start, end, mid, k)) {
                finalAns = mid;
            } else {
                start = mid + 1;
            }
        }
        return finalAns;
    }


    static boolean getPart(int[] arr, int start, int end, int ans, int k) {
        int count = 0;
        int sum = 0;
        for (int i = start; i < end; i++) {
            if ((sum + arr[i]) > ans) {
                sum += arr[i];
                if (count > k) {
                    return false;
                }
            } else {
                count++;
                sum = 0;
            }
        }
        return true;
    }

}
